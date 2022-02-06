package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConsumerApplication_80
 * @Create: 22/1/25 23:21
 * @Version: 1.0
 */

@SpringBootApplication
@EnableFeignClients(basePackages = "com.youjia.springcloud")
public class FeignConsumerApplication_8000 {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication_8000.class, args);
    }

}
