package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wansheng
 * @createDate 2022/7/15 0:06
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {
    @Value("${service-url.nacos-user-service}")
    public String PAYMENT_URL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id")Long id){
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/nacos/" + id, String.class);
        log.info("获取的数据:"+result);
        return result;
    }

}
