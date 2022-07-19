package com.wbxnl.springcloud.controller;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/15 15:11
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Value("${spring.application.name}:${server.port}")
    private String servicePort;

    @GetMapping("/consul")
    public String getPaymentZk(){
        return "springcloud with consul :"+servicePort+"\t"+ UUID.randomUUID();
    }
}
