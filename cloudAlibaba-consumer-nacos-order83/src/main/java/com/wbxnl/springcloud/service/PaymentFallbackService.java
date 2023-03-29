package com.wbxnl.springcloud.service;

import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author wansheng
 * @createDate 2022/7/26 22:34
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult getPayment(Long id) {
        return new CommonResult(4444,"服务调用异常！",new Payment(id,""));
    }
}
