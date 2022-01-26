package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class DeptApplication_8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptApplication_8002.class, args);
    }

}
