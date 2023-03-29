package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/20 1:13
 */
@RestController
@RequestMapping("/message")
public class StreamMessageController {

    @Autowired
    private IMessageService iMessageService;

    @GetMapping("/send")
    public String sendMessage() {
        return iMessageService.send()?"发送成功！":"发送失败！";
    }
}
