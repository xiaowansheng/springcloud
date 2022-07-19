package com.wbxnl.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wansheng
 * @createDate 2022/7/17 12:38
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",fallback = PaymentHystrixService.class)
public interface PaymentService {

    @GetMapping("/payment/ok")
    public String ok();

    @GetMapping("/payment/timeout")
    public String timeOut();
}
