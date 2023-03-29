package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wansheng
 * @createDate 2022/7/26 20:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProviderMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderMain9004.class,args);
    }
}
