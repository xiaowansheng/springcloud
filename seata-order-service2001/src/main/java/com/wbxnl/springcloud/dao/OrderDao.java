package com.wbxnl.springcloud.dao;

import com.wbxnl.springcloud.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wansheng
 * @createDate 2022/7/27 18:49
 */
@Mapper
public interface OrderDao {
    /**
     * 创建订单
     * @param orderEntity
     * @return
     */
    public boolean create(OrderEntity orderEntity);

    /**
     * 修改订单状态
     * @param id
     * @param status
     * @return
     */
    public boolean update(@Param("id")Long id,@Param("status")Integer status);
}
