package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: EurekaServer_7002
 * @Create: 22/1/26 21:40
 * @Version: 1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class, args);
    }

}
