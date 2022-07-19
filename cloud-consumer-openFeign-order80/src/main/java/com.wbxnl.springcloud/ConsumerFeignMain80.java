package com.wbxnl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wansheng
 * @createDate 2022/7/14 23:59
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain80.class,args);
    }
}
