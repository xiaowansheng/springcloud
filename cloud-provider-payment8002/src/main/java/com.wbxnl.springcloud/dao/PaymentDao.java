package com.wbxnl.springcloud.dao;

import com.wbxnl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wansheng
 * @createDate 2022/7/14 14:56
 */
public interface PaymentDao {
    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id")long id);
}
