package com.wbxnl.springcloud.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author wansheng
 * @createDate 2022/7/20 22:06
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${spring.application.name}:${server.port}")
    private String servicePort;

    @GetMapping(value = "/nacos/{id}")
    public String insert(@PathVariable("id")Long id){
        return "serial:"+UUID.randomUUID()+" id:"+id+" service:"+servicePort;
    }

}
