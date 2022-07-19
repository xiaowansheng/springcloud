package com.wbxnl.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wansheng
 * @createDate 2022/7/17 16:21
 */
@Component
public class PaymentHystrixService implements PaymentService{
    @Override
    public String ok() {
        return "系统繁忙，请稍后再试！";
    }

    @Override
    public String timeOut() {
        return "系统繁忙，请稍后再试！";
    }
}
