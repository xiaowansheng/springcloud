package com.wbxnl.springcloud.service.impl;

import com.wbxnl.springcloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author wansheng
 * @createDate 2022/7/20 1:00
 */
@Service
public class IMessageServiceImpl implements IMessageService {
    @Autowired
    private StreamBridge streamBridge;

    @Override
    public boolean send() {
        String serial = UUID.randomUUID().toString();
        boolean flag = streamBridge.send("myChannel-out-0", MessageBuilder.withPayload(serial).build());
        System.out.println("发送消息: " + serial);
        return flag;
    }
}
