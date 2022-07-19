package com.wbxnl.springcloud.service;

import com.wbxnl.springcloud.entities.Payment;

/**
 * @author wansheng
 * @createDate 2022/7/14 15:19
 */
public interface PaymentService {
    public int insert(Payment payment);

    public Payment getPaymentById(Long id);
}
