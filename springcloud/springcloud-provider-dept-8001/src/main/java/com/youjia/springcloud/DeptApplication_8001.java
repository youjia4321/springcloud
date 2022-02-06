package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptApplication_8001
 * @Create: 22/1/25 22:34
 * @Version: 1.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker // 启动熔断机制
public class DeptApplication_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptApplication_8001.class, args);
    }

}
