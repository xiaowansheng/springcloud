package com.wbxnl.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wansheng
 * @createDate 2022/7/20 20:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAlibabaMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibabaMain9002.class,args);
    }
}
