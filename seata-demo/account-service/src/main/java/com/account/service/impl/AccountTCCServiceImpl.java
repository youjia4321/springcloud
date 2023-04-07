package com.account.service.impl;

import com.account.entity.AccountFreeze;
import com.account.mapper.AccountFreezeMapper;
import com.account.mapper.AccountMapper;
import com.account.service.AccountTCCService;
import io.seata.core.context.RootContext;
import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: gongsl
 * @Date: 2021-11-18 21:55
 */

@Service
public class AccountTCCServiceImpl implements AccountTCCService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountFreezeMapper freezeMapper;

    @Override
    @Transactional
    public void prepare(String userId, int money) {
        //1.获取事务id
        String xid = RootContext.getXID();
        //判断表中是否已经有冻结记录，如果有，一定是CANCEL执行过，这时要拒绝业务避免业务悬挂
        AccountFreeze freeze = freezeMapper.selectById(xid);
        if (freeze != null) {
            //CANCEL已经执行过了，所以这里要拒绝业务
            return;
        }
        //2.扣减可用余额
        accountMapper.deduct(userId, money);
        //3.记录冻结金额、事务状态
        AccountFreeze accountFreeze = new AccountFreeze();
        accountFreeze.setXid(xid);
        accountFreeze.setUserId(userId);
        accountFreeze.setFreezeMoney(money);
        accountFreeze.setState(AccountFreeze.State.TRY);
        freezeMapper.insert(accountFreeze);
    }

    /**
     * 到这里，说明第一阶段已经执行成功，既然已经成功，所以这里只需要删除冻结记录即可
     * @param context
     * @return
     */
    @Override
    public boolean confirm(BusinessActionContext context) {
        //我们也可以通过上下文对象获取事务id
        String xid = context.getXid();
        //返回值为1说明删除成功
        int count = freezeMapper.deleteById(xid);
        return count == 1;
    }

    @Override
    public boolean cancel(BusinessActionContext context) {
        String xid = context.getXid();
        //查询冻结记录
        AccountFreeze freeze = freezeMapper.selectById(xid);
        //空回滚判断，如果freeze为null，说明try没执行，需要空回滚
        if (freeze == null) {
            freeze = new AccountFreeze();
            /*
            接口中我们已经通过@BusinessActionContextParameter注解将
            userId放到上下文对象中了，所以这里直接通过上下文对象获取即可
             */
            String userId = context.getActionContext("userId").toString();
            freeze.setUserId(userId);
            freeze.setFreezeMoney(0);
            freeze.setState(AccountFreeze.State.CANCEL);
            freeze.setXid(xid);
            freezeMapper.insert(freeze);
            return true;
        }
        //幂等判断
        if (freeze.getState() == AccountFreeze.State.CANCEL) {
            //已经处理过一次CANCEL了，无需重复处理
            return true;
        }
        //恢复可用余额
        accountMapper.refund(freeze.getUserId(), freeze.getFreezeMoney());
        //将冻结金额清零，状态改为CANCEL
        freeze.setFreezeMoney(0);
        freeze.setState(AccountFreeze.State.CANCEL);
        int count = freezeMapper.updateById(freeze);
        return count == 1;
    }
}
