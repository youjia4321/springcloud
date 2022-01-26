package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: EurekaServer_7001
 * @Create: 22/1/26 17:22
 * @Version: 1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class, args);
    }

}
