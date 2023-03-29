package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wansheng
 * @createDate 2022/7/20 1:20
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMqConsumerMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMqConsumerMain8802.class,args);
    }
}
