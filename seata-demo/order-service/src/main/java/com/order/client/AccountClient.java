package com.order.client;

import com.order.global.Response;
import com.order.global.Status;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author gongsl
 */

@Service
@FeignClient(value = "account-service", fallbackFactory = AccountClient.AccountFallbackFactory.class)
//@FeignClient(value = "account-service")
public interface AccountClient {

    @PostMapping("/account/{userId}/{money}")
    Response deduct(@PathVariable("userId") String userId, @PathVariable("money") Integer money);


    @Component
    @Slf4j
    class AccountFallbackFactory implements FallbackFactory<AccountClient> {

        @Override
        public AccountClient create(Throwable throwable) {
            return new FallbackWithFactory();
        }

        static class FallbackWithFactory implements AccountClient {
            @Override
            public Response deduct(String userId, Integer money) {
                return new Response(Status.ERROR.getCode(), Status.ERROR.getMsg(), "account-service请求失败!");
            }
        }

    }

}
