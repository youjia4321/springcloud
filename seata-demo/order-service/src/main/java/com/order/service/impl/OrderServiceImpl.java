package com.order.service.impl;

import com.order.client.AccountClient;
import com.order.client.StorageClient;
import com.order.entity.Order;
import com.order.global.Response;
import com.order.mapper.OrderMapper;
import com.order.service.OrderService;
import feign.FeignException;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gongsl
 */
@Slf4j
@Service
//@Transactional
@GlobalTransactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private AccountClient accountClient;
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void create(Order order) {
        // 创建订单
        orderMapper.insert(order);
        try {
            // 扣用户余额
            Response response = accountClient.deduct(order.getUserId(), order.getMoney());
            if(response.getCode().equals("1")) {
                log.info("===> {}", response.getData());
                throw new  RuntimeException((String) response.getData());
            }
            // 扣商品库存
            storageClient.deduct(order.getCommodityCode(), order.getCount());

        } catch (FeignException e) {
            log.error("下单失败，原因:{}", e.contentUTF8(), e);
            throw new RuntimeException(e.contentUTF8(), e);
        }
    }
}
