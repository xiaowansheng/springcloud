package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import com.wbxnl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/create")
    public CommonResult insert(@RequestBody Payment payment){
        int result=paymentService.insert(payment);
        log.info("******插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入成功！"+servicePort,result);
        }else {
            return new CommonResult(444,"插入失败"+servicePort,null);
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

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String s: services) {
            log.info("***element:"+s);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance s:
             instances) {
            log.info(s.getServiceId()+"\t"+s.getInstanceId()+"\t"+s.getHost()+"\t"+s.getPort());
        }
        return discoveryClient;
    }
}
