package com.wbxnl.springcloud.service;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.service.impl.StorageServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:28
 */
@FeignClient(value = "seata-storage-service" ,fallback = StorageServiceImpl.class)
public interface StorageService {

    @PostMapping("/storage/update")
    public CommonResult update(@RequestParam("id")Long id,@RequestParam("count")Integer count);
}
