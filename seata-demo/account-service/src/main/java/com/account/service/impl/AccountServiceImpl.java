package com.account.service.impl;

import com.account.global.Response;
import com.account.mapper.AccountMapper;
import com.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gongsl
 */
@Slf4j
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Response deduct(String userId, int money) {
        log.info(">>>开始扣款!");
        try {
            accountMapper.deduct(userId, money);
            log.info(">>>扣款成功!");
            return new Response("0", "成功");
        } catch (Exception e) {
            throw new RuntimeException("扣款失败，可能是余额不足!", e);
        }
    }
}
