package com.account.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className AccountTCCService
 * @date 2023/4/5 19:08
 */

@LocalTCC
public interface AccountTCCService {

    /**
     * Try逻辑，@TwoPhaseBusinessAction中的name属性要与当前方法名一致，用于指定Try逻辑对应的方法
     */
    @TwoPhaseBusinessAction(name = "prepare",
            commitMethod = "confirm",
            rollbackMethod = "cancel")
    void prepare(@BusinessActionContextParameter(paramName = "userId") String userId,
                 @BusinessActionContextParameter(paramName = "money") int money);

    /**
     * 二阶段Confirm确认方法，可以另命名，但要保证和上面commitMethod的值一致
     * @param context 上下文，可以传递try方法的参数
     * @return boolean 执行是否成功
     */
    boolean confirm(BusinessActionContext context);

    /**
     * 二阶段回滚方法，方法名要和上面rollbackMethod的值一致
     */
    boolean cancel(BusinessActionContext context);

}
