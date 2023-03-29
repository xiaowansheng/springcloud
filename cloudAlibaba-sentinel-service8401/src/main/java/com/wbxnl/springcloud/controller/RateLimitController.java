package com.wbxnl.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import com.wbxnl.springcloud.handle.CustomHandle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/26 17:07
 */
@RestController
@Slf4j
public class RateLimitController {

    @GetMapping("/test03")
    @SentinelResource(value = "test03",blockHandler = "handleException")
    public CommonResult test03(){
      log.info("测试03===》");
      return new CommonResult(200,"成功。",new Payment(1111L,"131212313"));
    }
    public CommonResult handleException(BlockException exception){
        return new CommonResult(404,"按资源名限流，调用繁忙。",null);
    }

    @GetMapping("/test04")
    @SentinelResource(value = "/test04",blockHandler = "handleException2")
    public CommonResult test04(){
        log.info("测试04===》");
        return new CommonResult(200,"test04调用成功。",null);
    }
    public CommonResult handleException2(BlockException exception){
        return new CommonResult(404,"按url限流，调用繁忙。",null);
    }

    @GetMapping("/test05")
    @SentinelResource(value = "test05",blockHandlerClass = CustomHandle.class,blockHandler = "handleTest")
    public String test045(){
        log.info("测试05===》");
        return "test05===>";
    }
}
