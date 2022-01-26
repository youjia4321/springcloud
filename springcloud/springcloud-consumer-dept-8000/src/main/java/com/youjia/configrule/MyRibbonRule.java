package com.youjia.configrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: MyRibbonRule
 * @Create: 22/1/26 23:17
 * @Version: 1.0
 */

@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule() {
        // 修改负载均衡的策略
        // return new RandomRule();
        return new MyRule(); // 使用自定义的规则
    }

}
