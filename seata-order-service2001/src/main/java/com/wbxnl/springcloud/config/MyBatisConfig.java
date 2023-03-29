package com.wbxnl.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wansheng
 * @createDate 2022/7/27 18:48
 */
@Configuration
@MapperScan({"com.wbxnl.springcloud.dao"})
public class MyBatisConfig {
}
