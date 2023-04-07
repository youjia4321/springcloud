package com.order.web;

import com.order.client.PortalClient;
import com.order.entity.Order;
import com.order.global.Response;
import com.order.global.Status;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gongsl
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private PortalClient portalClient;

    @PostMapping("/create")
    public Response createOrder(@RequestBody Order order){
        orderService.create(order);
        return new Response(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), "下单成功!");
    }

    @GetMapping("/portal/auth/list/{auditStatus}")
    public Response auth_list(@PathVariable("auditStatus") Integer auditStatus){
        return new Response(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), portalClient.get_auth_list(auditStatus));
    }

}
