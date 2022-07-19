package com.wbxnl.springcloud.service.Impl;

import com.wbxnl.springcloud.dao.PaymentDao;
import com.wbxnl.springcloud.entities.Payment;
import com.wbxnl.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wansheng
 * @createDate 2022/7/14 15:17
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
