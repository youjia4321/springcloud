package com.youjia.springcloud.controller;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.pojo.User;
import com.youjia.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: UserController
 * @Create: 22/4/16 16:05
 * @Version: 1.0
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/coreUser/{userId}")
    public CommonResult<User> queryUser(@PathVariable Integer userId) {
        return CommonResult.success(userService.findById(userId));
    }

    @GetMapping("/bizUser/{userId}")
    public CommonResult<User> queryBizUser(@PathVariable Integer userId) {
        return CommonResult.success(userService.findByIdBiz(userId));
    }

}
