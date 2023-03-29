package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wansheng
 * @createDate 2022/7/20 23:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerMain81 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerMain81.class,args);
    }
}
