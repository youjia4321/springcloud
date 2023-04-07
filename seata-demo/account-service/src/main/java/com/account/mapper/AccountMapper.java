package com.account.mapper;

import com.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author gongsl
 */
public interface AccountMapper extends BaseMapper<Account> {

    /**
     * 扣款
     * @param userId
     * @param money
     * @return
     */
    @Update("update account_tbl set money = money - ${money} where user_id = #{userId}")
    int deduct(@Param("userId") String userId, @Param("money") int money);

    /**
     * 退款
     * @param userId
     * @param money
     * @return
     */
    @Update("update account_tbl set money = money + ${money} where user_id = #{userId}")
    int refund(@Param("userId") String userId, @Param("money") int money);
}
