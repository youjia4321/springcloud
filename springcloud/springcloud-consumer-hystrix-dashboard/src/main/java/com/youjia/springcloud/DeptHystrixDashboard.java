package com.youjia.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptHystrixDashboard
 * @Create: 22/2/6 15:09
 * @Version: 1.0
 */

@SpringBootApplication
@EnableHystrixDashboard // 开启dashboard
public class DeptHystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixDashboard.class, args);
    }

}
