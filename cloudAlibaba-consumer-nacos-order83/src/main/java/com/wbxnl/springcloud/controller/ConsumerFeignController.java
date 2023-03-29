package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wansheng
 * @createDate 2022/7/26 22:37
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerFeignController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/feign/payment/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id){
        return paymentService.getPayment(id);
    }
}
