package com.youjia.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: MultiSourceApplication
 * @Create: 22/4/16 15:10
 * @Version: 1.0
 */

@SpringBootApplication
@MapperScan(basePackages = "com.youjia.springcloud.mapper.*")
public class MultiSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiSourceApplication.class, args);
    }

}
