package com.youjia.web.controller;

import com.youjia.web.domain.CallReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className WebTestController
 * @date 2022/11/14 17:11
 */

@RestController
@RequestMapping("/test")
@Slf4j
public class WebTestController {

    @GetMapping("/print")
    public String printStr() {
        return "你成功部署了springboot项目";
    }


    @PostMapping("/callback")
    public Object callback(@RequestBody CallReq req) {
        log.info("接收到审核模块消息，批次id：{}，描述：{}", req.getBatchTransactionId(), req.getResult());
        Map<String, Object> map = new HashMap<>();
        map.put("resultCode", "200");
        map.put("resultDesc", "");
        map.put("resultData", "");
        return map;
    }

}
