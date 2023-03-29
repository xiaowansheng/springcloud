package com.wbxnl.springcloud.service.impl;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.service.AccountService;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:49
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public CommonResult update(Long id, BigDecimal money) {
        return new CommonResult(444,"调用账户微服务出现错误");
    }
}
