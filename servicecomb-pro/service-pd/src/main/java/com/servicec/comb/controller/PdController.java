package com.servicec.comb.controller;

import com.servicec.comb.service.PdService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className PdController
 * @date 2022/3/9 10:14
 */

@RestController
@RequestMapping("/pd")
public class PdController {

    @Autowired
    PdService pdService;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return pdService.sayHello(name);
    }

}
