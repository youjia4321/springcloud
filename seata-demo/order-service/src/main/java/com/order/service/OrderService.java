package com.order.service;

import com.order.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}