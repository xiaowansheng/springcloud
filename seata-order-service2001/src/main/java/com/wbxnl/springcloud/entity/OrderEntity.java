package com.wbxnl.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 18:38
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity
{
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private Integer status; //订单状态：0：创建中；1：已完结
}
