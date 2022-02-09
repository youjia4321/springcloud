package com.youjia.springcloud.service;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.api.ResultCode;
import com.youjia.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptFallbackClientService
 * @Create: 22/2/9 21:06
 * @Version: 1.0
 */
public class DeptFallbackClientService implements DeptClientService{
    @Override
    public CommonResult<Boolean> addDept(Dept dept) {
        return CommonResult.success(ResultCode.SERVICE_DOWN, "客户端提供了服务降级信息，该服务已关闭");
    }

    @Override
    public CommonResult<Dept> queryById(Long id) {
        return CommonResult.success(ResultCode.SERVICE_DOWN, "客户端提供了服务降级信息，该服务已关闭");
    }

    @Override
    public CommonResult<List<Dept>> queryAll() {
        return CommonResult.success(ResultCode.SERVICE_DOWN, "客户端提供了服务降级信息，该服务已关闭");
    }
}
