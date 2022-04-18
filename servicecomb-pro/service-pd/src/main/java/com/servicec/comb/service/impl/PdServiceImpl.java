package com.servicec.comb.service.impl;

import com.servicec.comb.service.PdService;
import org.springframework.stereotype.Service;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className PdServiceImpl
 * @date 2022/3/9 10:14
 */

@Service
public class PdServiceImpl implements PdService {

    @Override
    public String sayHello(String name) {
        System.out.println("名称是："+name);
        return "请求成功，返回名称："+name;
    }

}
