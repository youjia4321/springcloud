package com.youjia.springcloud.service;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.config.DeptClientFallbackFactory;
import com.youjia.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: CommonService
 * @Create: 22/2/5 15:53
 * @Version: 1.0
 */

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT", fallbackFactory = DeptClientFallbackFactory.class)
public interface DeptClientService {

    @PostMapping("/dept/add")
    CommonResult<Boolean> addDept(Dept dept);

//    @GetMapping("/dept/get/{id}")
//    CommonResult<Dept> queryById(@PathVariable("id") Long id);

    @GetMapping("/hystrix/dept/get/{id}")
    CommonResult<Dept> queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    CommonResult<List<Dept>> queryAll();

}
