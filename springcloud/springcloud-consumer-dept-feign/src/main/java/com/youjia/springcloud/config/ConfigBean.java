package com.youjia.springcloud.config;

import com.youjia.springcloud.interceptor.HeadClientHttpRequestInterceptor;
import com.youjia.springcloud.interceptor.TrackLogClientHttpRequestInterceptor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConfigBean
 * @Create: 22/1/25 23:14
 * @Version: 1.0
 */

@Configuration
public class ConfigBean { // @Configuration -- spring applicationContext.xml

    // 配置负载均衡实现restTemplate
    @Bean
    @LoadBalanced // Ribbon
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(
                Arrays.asList(new TrackLogClientHttpRequestInterceptor(),
                new HeadClientHttpRequestInterceptor()));
        return restTemplate;
    }

}
