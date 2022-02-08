package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConfigServer3344
 * @Create: 22/2/8 13:44
 * @Version: 1.0
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344.class, args);
    }

}
