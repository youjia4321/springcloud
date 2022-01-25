package com.youjia.springcloud.contorller;

import com.alibaba.fastjson.JSON;
import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: ConsumerController
 * @Create: 22/1/25 23:11
 * @Version: 1.0
 */

@RestController
@RequestMapping("/req")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dept/list")
    public CommonResult<List<Dept>> queryAll() {
        return restTemplate.getForObject("http://localhost:8001/dept/list", CommonResult.class);
    }

    @GetMapping("/dept/get/{id}")
    public CommonResult<List<Dept>> get(@PathVariable long id) {
        return restTemplate.getForObject("http://localhost:8001/dept/get/"+id, CommonResult.class);
    }

    @PostMapping("/dept/add")
    public CommonResult<List<Dept>> get(@RequestBody Dept dept) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>(JSON.toJSONString(dept), headers);
        return restTemplate.postForObject("http://localhost:8001/dept/add", entity, CommonResult.class);
    }

}
