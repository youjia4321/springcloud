package com.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author gongsl
 */
@FeignClient("storage-service")
public interface StorageClient {

    @PostMapping("/storage/{code}/{count}")
    void deduct(@PathVariable("code") String code, @PathVariable("count") Integer count);
}
