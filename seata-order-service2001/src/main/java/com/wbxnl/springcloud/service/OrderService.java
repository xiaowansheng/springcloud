package com.wbxnl.springcloud.service;

import com.wbxnl.springcloud.entity.OrderEntity;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:16
 */

public interface OrderService {
    /**
     * 创建订单
     * @param order
     * @return
     */
    public boolean create(OrderEntity order);

    /**
     * 修改订单状态
     * @param id
     * @param status
     * @return
     */
    public boolean update(Long id,Integer status);
}
