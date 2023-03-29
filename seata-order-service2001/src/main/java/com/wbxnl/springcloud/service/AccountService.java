package com.wbxnl.springcloud.service;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.service.impl.AccountServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 19:39
 */
@FeignClient(value = "seata-account-service",fallback = AccountServiceImpl.class)
public interface AccountService {
    @PostMapping("/account/update")
    public CommonResult update(@RequestParam("id")Long id,@RequestParam("money") BigDecimal money);
}
