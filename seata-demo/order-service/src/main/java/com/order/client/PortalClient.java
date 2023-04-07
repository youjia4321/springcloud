package com.order.client;

import com.order.global.Response;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className PortalClient
 * @date 2023/4/6 18:08
 */

@FeignClient(name = "portal-client", url = "https://rcs.telinovo.com")
public interface PortalClient {

    @GetMapping("/risk-audit/authentication/auth-list")
    Object get_auth_list(@RequestParam Integer auditStatus);

    @Slf4j
    @Component
    class PortalFallbackFactory implements FallbackFactory<PortalClient> {

        @Override
        public PortalClient create(Throwable throwable) {
            return (s) -> new Response<>("1", "失败");
        }
    }
}
