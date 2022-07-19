package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/17 1:44
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/ok")
    public String ok(){
        return paymentService.ok();
    }

    @GetMapping("/timeout")
    public String timeOut(){
        return paymentService.timeOut();
    }

    //服务熔断
    @GetMapping("/get/{id}")
    public String getPayment(@PathVariable("id") Long id){
        return paymentService.paymentCircuitBreak(id);
    }
}
