package com.servicec.comb;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className ServicePdApplication
 * @date 2022/3/9 10:21
 */

@SpringBootApplication
@EnableServiceComb
public class ServicePdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePdApplication.class, args);
    }

}
