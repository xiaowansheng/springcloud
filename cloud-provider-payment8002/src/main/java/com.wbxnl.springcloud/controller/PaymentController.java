package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import com.wbxnl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author wansheng
 * @createDate 2022/7/14 15:22
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${spring.application.name}:${server.port}")
    private String servicePort;

    @PostMapping(value = "/create")
    public CommonResult insert(@RequestBody Payment payment){
        int result=paymentService.insert(payment);
        log.info("******插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入成功！"+servicePort,result);
        }else {
            return new CommonResult(444,"插入失败!"+servicePort,null);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果："+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功！"+servicePort,payment);
        }else {
            return new CommonResult(444,"没有对应id="+id+"的记录！"+servicePort,null);
        }

    }
}
