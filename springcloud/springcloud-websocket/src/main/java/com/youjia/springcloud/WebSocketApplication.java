package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: WebSocketApplication
 * @Create: 22/4/15 13:07
 * @Version: 1.0
 */

@SpringBootApplication
@EnableScheduling
public class WebSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
    }

}
