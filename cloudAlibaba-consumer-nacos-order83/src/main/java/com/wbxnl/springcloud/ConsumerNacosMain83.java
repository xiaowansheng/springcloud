package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wansheng
 * @createDate 2022/7/26 21:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosMain83.class,args);
    }
}
