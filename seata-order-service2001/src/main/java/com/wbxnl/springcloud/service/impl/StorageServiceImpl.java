package com.wbxnl.springcloud.service.impl;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.service.StorageService;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:52
 */
public class StorageServiceImpl implements StorageService {
    @Override
    public CommonResult update(Long id, Integer count) {
        return new CommonResult(444,"调用库存微服务出现错误！");
    }
}
