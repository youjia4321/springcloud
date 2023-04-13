package com.youjia.springcloud.config;

import com.youjia.springcloud.service.SmsService;
import com.youjia.springcloud.service.impl.SmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SmsAutoConfig
 * @date 2023/4/13 14:57
 */

@Configuration
@EnableConfigurationProperties({SmsProperties.class})
public class SmsAutoConfig {

    @Autowired
    SmsProperties smsProperties;

    //    将短信发送的业务类交给spring容器进行管理
    @Bean
    public SmsService smsService(){
        return new SmsServiceImpl(smsProperties.getAccessKeyId(),smsProperties.getAccesskeySecret());
    }

}
