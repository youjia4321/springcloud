package com.account.service;

import com.account.global.Response;

public interface AccountService {

    /**
     * 从用户账户中扣款
     * @param userId
     * @param money
     */
    Response deduct(String userId, int money);
}