package com.youjia.springcloud.contorller;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.pojo.Dept;
import com.youjia.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConsumerController
 * @Create: 22/1/25 23:11
 * @Version: 1.0
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @GetMapping("/dept/list")
    public CommonResult<List<Dept>> queryAll() {
        return deptClientService.queryAll();
    }

    @GetMapping("/dept/get/{id}")
    public CommonResult<Dept> get(@PathVariable long id) {
        return deptClientService.queryById(id);
    }

    @PostMapping("/dept/add")
    public CommonResult<Boolean> get(@RequestBody Dept dept) {
        return deptClientService.addDept(dept);
    }



}
