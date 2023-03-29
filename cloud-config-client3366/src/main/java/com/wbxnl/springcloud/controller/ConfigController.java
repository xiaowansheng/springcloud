package com.wbxnl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansheng
 * @createDate 2022/7/19 2:53
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {
    @Value("${config.name}")
    private String configName;
    @Value("${config.version}")
    private String configVersion;

    @GetMapping("/name")
    public String getConfigName()
    {
        return configName;
    }

    @GetMapping("/version")
    public String getConfigVersion()
    {
        return configVersion;
    }
}
