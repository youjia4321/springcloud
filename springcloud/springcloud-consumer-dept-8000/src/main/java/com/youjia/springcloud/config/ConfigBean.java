package com.youjia.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConfigBean
 * @Create: 22/1/25 23:14
 * @Version: 1.0
 */

@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
