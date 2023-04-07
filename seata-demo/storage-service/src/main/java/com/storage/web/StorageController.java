package com.storage.web;

import com.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author gongsl
 */
@RestController
@RequestMapping("storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     * @param code 商品编号
     * @param count 要扣减的数量
     * @return
     */
    @PostMapping("/{code}/{count}")
    public void deduct(@PathVariable("code") String code,@PathVariable("count") Integer count){
        storageService.deduct(code, count);
    }
}
