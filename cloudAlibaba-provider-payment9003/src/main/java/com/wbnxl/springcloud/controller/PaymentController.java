package com.wbnxl.springcloud.controller;

import com.wbxnl.springcloud.entities.CommonResult;
import com.wbxnl.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author wansheng
 * @createDate 2022/7/26 20:42
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    public static HashMap<Long, Payment> data=new HashMap<>();
    {
        data.put(1L,new Payment(1L,"aava2132131a33sa===>9003"));
        data.put(2L,new Payment(2L,"fasa3123212313as===>9003"));
        data.put(3L,new Payment(3L,"vdav22321cavs133===>9003"));
    }

    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id")Long id){
        return new CommonResult(200,"查询成功！",data.get(id));
    }
}
