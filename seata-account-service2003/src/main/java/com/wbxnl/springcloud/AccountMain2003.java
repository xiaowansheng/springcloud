package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:48
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AccountMain2003 {
    public static void main(String[] args) {
        SpringApplication.run(AccountMain2003.class,args);
    }
}
