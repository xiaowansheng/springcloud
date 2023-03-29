package com.wbxnl.springcloud.service.impl;

import com.wbxnl.springcloud.dao.OrderDao;
import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.entity.OrderEntity;
import com.wbxnl.springcloud.service.AccountService;
import com.wbxnl.springcloud.service.OrderService;
import com.wbxnl.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:21
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;

    @Override
    public boolean create(OrderEntity order) {
//        创建订单
        log.info("====》订单正在创建。。。");
        boolean orderFlag = orderDao.create(order);
        log.info("====》订单创建完成。");

        log.info("===》正在修改库存。。。");
        CommonResult storageFlag = storageService.update(order.getProductId(), order.getCount());
        log.info("====》库存修改完成。");

        log.info("===》正在准备支付。。。");
        CommonResult accountFlag = accountService.update(order.getUserId(), order.getMoney());
        log.info("====》支付完成。");
        return orderFlag&&storageFlag.getCode()==200&&accountFlag.getCode()==200;
    }

    @Override
    public boolean update(Long id, Integer status) {
        return false;
    }
}
