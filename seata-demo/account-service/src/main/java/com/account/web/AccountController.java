package com.account.web;

import com.account.global.Response;
import com.account.service.AccountService;
import com.account.service.AccountTCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gongsl
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountTCCService accountTCCService;

    /**
     * 扣款
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/{userId}/{money}")
    public Response deduct(@PathVariable("userId") String userId,
                           @PathVariable("money") Integer money){
        try {
            return accountService.deduct(userId, money);
//        accountTCCService.prepare(userId, money);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}
