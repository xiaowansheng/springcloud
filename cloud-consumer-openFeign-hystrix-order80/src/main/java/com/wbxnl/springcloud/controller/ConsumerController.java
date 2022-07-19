package com.wbxnl.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wbxnl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/17 12:41
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/ok")
    public String ok(){
        return paymentService.ok();
    }

    @GetMapping("/payment/timeout")
    public String timeOut(){
        return paymentService.timeOut();
    }

    public String paymentTimeout(){
        return "系统超时，请稍后再试！";
    }

    @HystrixCommand(fallbackMethod = "paymentTimeout",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")
    })
    @GetMapping("/payment/timeout2")
    public String timeOut2(){
        int t=5/0;
        return paymentService.timeOut();
    }

}
