package com.youjia.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.api.ResultCode;
import com.youjia.springcloud.pojo.Dept;
import com.youjia.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: HystrixController
 * @Create: 22/2/5 21:38
 * @Version: 1.0
 */

@RestController
@RequestMapping("/hystrix/dept")
public class HystrixController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public CommonResult<Dept> get(@PathVariable long id) {
        Dept dept = deptService.queryById(id);
        if(null == dept) {
            throw new RuntimeException("无法找到对应的信息");
        }
        return CommonResult.success(dept);
    }

    // 备选方法
    public CommonResult<Dept> hystrixGet(long id) {
        return CommonResult.success(ResultCode.SERVICE_DOWN, "无法找到对应id=> "+id+" @Hystrix 的信息");
    }

}
