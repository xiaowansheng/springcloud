package com.wbxnl.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * @author wansheng
 * @createDate 2022/7/17 1:39
 */
@Service
public class PaymentService {

    public String ok(){
        return Thread.currentThread().getName()+" payment_ok";
    }

    public String paymentTimeout(){
        return "服务时间超时，请稍后再试！";
    }

    @HystrixCommand(fallbackMethod = "paymentTimeout",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })
    public String timeOut(){
        long begin = new Date().getTime();
        int sleep=3;
        try {
            Thread.sleep(sleep*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = new Date().getTime();
        return Thread.currentThread().getName()+" payment_timeout"+" 延迟："+(end-begin)+"ms";
    }

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreak_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    public String paymentCircuitBreak(Long id){
        if(id<0){
            throw new RuntimeException("id不能负数！");
        }
        return "调用成功！id:"+id+",uuid:"+ UUID.randomUUID();
    }

    public String paymentCircuitBreak_fallback(Long id){
        return "id:"+id+",id不能为负数，调用失败！";
    }
}
