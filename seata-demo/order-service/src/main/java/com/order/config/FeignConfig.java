package com.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.net.URLDecoder;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className FeignConfig
 * @date 2023/4/7 16:16
 */

@Slf4j
@Configuration
public class FeignConfig implements RequestInterceptor {

    @SneakyThrows
    @Override
    public void apply(RequestTemplate requestTemplate) {

        String url = requestTemplate.request().url();

        url = URLDecoder.decode(url, "UTF-8");

        log.debug("当前请求地址 url = {}", url);

    }

}
