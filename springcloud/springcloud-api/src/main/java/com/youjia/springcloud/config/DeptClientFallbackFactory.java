package com.youjia.springcloud.config;

import com.youjia.springcloud.api.CommonResult;
import com.youjia.springcloud.api.ResultCode;
import com.youjia.springcloud.pojo.Dept;
import com.youjia.springcloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: youjia
 * @Description: 服务降级 - 客户端【服务熔断 服务端】
 * @ClassName: DeptClientFallbackFctory
 * @Create: 22/2/5 22:05
 * @Version: 1.0
 */

@Component
public class DeptClientFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
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
        };
    }

}
