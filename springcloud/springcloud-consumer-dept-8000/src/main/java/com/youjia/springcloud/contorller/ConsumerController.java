package com.youjia.springcloud.contorller;

import com.alibaba.fastjson.JSON;
import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${rest.deptUrlPrefix}")
    private String REST_URL_PREFIX;

    @GetMapping("/dept/list")
    public CommonResult<List<Dept>> queryAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", CommonResult.class);
    }

    @GetMapping("/dept/get/{id}")
    public CommonResult<Dept> get(@PathVariable long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+id, CommonResult.class);
    }

    @PostMapping("/dept/add")
    public CommonResult<Boolean> get(@RequestBody Dept dept) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json;charset=UTF-8");
        HttpEntity<String> entity = new HttpEntity<>(JSON.toJSONString(dept), headers);
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", entity, CommonResult.class);
    }

}
