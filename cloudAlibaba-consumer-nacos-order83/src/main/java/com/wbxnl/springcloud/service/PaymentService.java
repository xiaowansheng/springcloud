package com.wbxnl.springcloud.service;

import com.wbxnl.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wansheng
 * @createDate 2022/7/26 22:32
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
@Component
public interface PaymentService {
    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id);
}
