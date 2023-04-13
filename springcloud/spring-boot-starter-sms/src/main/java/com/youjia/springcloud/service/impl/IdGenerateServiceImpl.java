package com.youjia.springcloud.service.impl;

import com.youjia.springcloud.service.IdGenerateService;

import java.util.Random;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className IdGenerateServiceImpl
 * @date 2023/4/13 15:26
 */
public class IdGenerateServiceImpl implements IdGenerateService {

    private Long workId;

    public IdGenerateServiceImpl(Long workId) {
        this.workId = workId;
    }

    @Override
    public Long generate() {
        return new Random().nextInt(100) + this.workId;
    }

}
