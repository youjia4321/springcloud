package com.youjia.springcloud;

import com.youjia.configrule.MyRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConsumerApplication_80
 * @Create: 22/1/25 23:21
 * @Version: 1.0
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = MyRibbonRule.class) // 自定义负载均衡
public class ConsumerApplication_8000 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication_8000.class, args);
    }

}
