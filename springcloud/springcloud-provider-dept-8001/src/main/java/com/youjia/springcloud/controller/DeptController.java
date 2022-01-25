package com.youjia.springcloud.controller;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.pojo.Dept;
import com.youjia.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptController
 * @Create: 22/1/25 22:30
 * @Version: 1.0
 */

@RestController()
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/list")
    public CommonResult<List<Dept>> list() {
        return CommonResult.success(deptService.queryAll());
    }

    @GetMapping("/get/{id}")
    public CommonResult<Dept> get(@PathVariable long id) {
        return CommonResult.success(deptService.queryById(id));
    }

    @PostMapping("/add")
    public CommonResult<Boolean> add(@RequestBody Dept dept) {
        return CommonResult.success(deptService.addDept(dept));
    }

}
