package com.wbxnl.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wansheng
 * @createDate 2022/7/26 21:10
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String SERVICE_URL = "http://nacos-payment-provider";

    @GetMapping("/payment/{id}")
    //@SentinelResource(value = "fallback") //没有配置
    @SentinelResource(value = "fallback",fallback = "handlerFallback") //fallback只负责业务异常
    //@SentinelResource(value = "fallback",blockHandler = "blockHandler") //blockHandler只负责sentinel控制台配置违规
    public CommonResult getPayment(@PathVariable("id")Long id){
        CommonResult result = restTemplate.getForObject(SERVICE_URL + "/payment/get/" + id, CommonResult.class);
        if(id<1){
            throw new IllegalArgumentException("非法参数异常！");
        }else if(result.getData()==null){
            throw new NullPointerException("空指针异常！");
        }else{
            return result;
        }
    }
    public CommonResult handlerFallback(@PathVariable("id")Long id,Throwable e){
        return new CommonResult(444,"数据查询异常！",new Payment());
    }
}
