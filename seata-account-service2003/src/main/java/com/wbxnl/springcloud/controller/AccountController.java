package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:57
 */
@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;
    public CommonResult update(@RequestParam("id")Long id, @RequestParam("money")BigDecimal money){
        boolean update = accountService.update(id, money);
        CommonResult result=update?new CommonResult(200,"修改余额成功！"):new CommonResult(444,"修改余额失败。");
        log.info("账户controller：====》"+result);
        return result;
    }
}
