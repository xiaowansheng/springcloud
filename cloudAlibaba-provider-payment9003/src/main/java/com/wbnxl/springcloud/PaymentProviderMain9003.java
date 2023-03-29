package com.wbnxl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wansheng
 * @createDate 2022/7/26 20:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentProviderMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderMain9003.class,args);
    }
}
