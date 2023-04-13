package com.youjia.springcloud.config;

import com.youjia.springcloud.service.IdGenerateService;
import com.youjia.springcloud.service.impl.IdGenerateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className IdAutoConfig
 * @date 2023/4/13 15:24
 */

@ConditionalOnClass(IdProperties.class)
@Configuration
@EnableConfigurationProperties({IdProperties.class})
public class IdAutoConfig {

    @Autowired
    IdProperties idProperties;

    @Bean
    public IdGenerateService idGenerateService() {
        return new IdGenerateServiceImpl(idProperties.getWorkId());
    }

}
