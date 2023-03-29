package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wansheng
 * @createDate 2022/7/20 0:56
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMqProviderMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMqProviderMain8801.class,args);
    }
}
