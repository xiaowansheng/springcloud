package com.wbxnl.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/26 2:39
 */
@RestController
public class FlowLimitController {

    @GetMapping("/test01")
    public String test01(){
        return "测试：======》test01";
    }

    @GetMapping("/test02")
    public String test02(){
        return "测试：======》test02";
    }
}
