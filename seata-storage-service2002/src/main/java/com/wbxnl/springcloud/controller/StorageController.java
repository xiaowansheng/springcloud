package com.wbxnl.springcloud.controller;

import com.wbxnl.springcloud.entity.CommonResult;
import com.wbxnl.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:33
 */
@RestController
@Slf4j
public class StorageController {
    @Autowired
    private StorageService storageService;

    @PostMapping("/storage/update")
    public CommonResult update(@RequestParam("id")Long id,@RequestParam("count")Integer count){
        boolean update = storageService.update(id, count);
        CommonResult result=update?new CommonResult(200,"库存修改成功！"):new CommonResult(444,"库存修改失败！");
        log.info("库存controller===》"+result);
        return result;
    }

    @GetMapping("/storage/test")
    public CommonResult test(){
        return new CommonResult(200,"接口测试！");
    }
}
