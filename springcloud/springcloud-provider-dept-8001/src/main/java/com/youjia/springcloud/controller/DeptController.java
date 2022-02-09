package com.youjia.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.pojo.Dept;
import com.youjia.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptController
 * @Create: 22/1/25 22:30
 * @Version: 1.0
 */

@RestController
@RequestMapping("/dept")
//@DefaultProperties(defaultFallback = "fallback_global_method") // 设置默认的服务降级方法
public class DeptController {

    @Autowired
    DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @HystrixCommand
    @GetMapping("/list")
    public CommonResult<List<Dept>> list() {
        return CommonResult.success(deptService.queryAll());
    }

    @HystrixCommand
    @GetMapping("/get/{id}")
    public CommonResult<Dept> get(@PathVariable long id) {
        return CommonResult.success(deptService.queryById(id));
    }

    @HystrixCommand
    @PostMapping("/add")
    public CommonResult<Boolean> add(@RequestBody Dept dept) {
        return CommonResult.success(deptService.addDept(dept));
    }

    // 获取注册中心的服务清单
    @GetMapping("/services")
    public CommonResult<Object> discovery() {
        List<String> services = client.getServices();
        System.out.println("services：" + services);

        // 获取某个实例
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"
                    + instance.getPort()+"\t"
                    + instance.getUri()+"\t"
                    + instance.getServiceId()
            );
        }
        return CommonResult.success(this.client);
    }

    public String fallback_global_method(){
        return null;
    }

}
