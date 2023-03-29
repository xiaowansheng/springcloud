package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.entity.OrderEntity;
import com.wbxnl.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:54
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public CommonResult<OrderEntity> create(OrderEntity order){
        boolean result = orderService.create(order);
        return result?new CommonResult<>(200,"创建成功！",order):new CommonResult<>(444,"创建失败！",order);
    }
}
