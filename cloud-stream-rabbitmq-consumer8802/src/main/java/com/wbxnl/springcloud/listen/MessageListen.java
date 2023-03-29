package com.wbxnl.springcloud.listen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

/**
 * @author wansheng
 * @createDate 2022/7/20 1:25
 */
@Configuration
@Slf4j
public class MessageListen {
    @Bean
    public Consumer<String> myChannel() {
        return message -> log.info("消息："+message);
    }
}
