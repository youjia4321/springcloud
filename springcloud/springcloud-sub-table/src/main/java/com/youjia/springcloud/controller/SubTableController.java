package com.youjia.springcloud.controller;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.domain.SysOperLog;
import com.youjia.springcloud.mapper.SysOperLogMapper;
import com.youjia.springcloud.utils.SysOperUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SubTableController
 * @date 2023/3/9 14:14
 */


@RestController
@RequestMapping("/")
@Slf4j
public class SubTableController {

    @Autowired
    private SysOperLogMapper sysOperLogMapper;

    @PostMapping("/add")
    public CommonResult<Object> addSysOperLog() {
        sysOperLogMapper.save(SysOperUtil.create());
        return CommonResult.success(null);
    }

    @GetMapping("/get")
    public CommonResult<SysOperLog> getSysOperLog(@RequestParam("operIds") Long operIds) {
        return CommonResult.success(sysOperLogMapper.select(operIds));
    }

}
