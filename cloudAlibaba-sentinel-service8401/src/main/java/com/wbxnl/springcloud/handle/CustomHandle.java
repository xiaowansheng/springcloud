package com.wbxnl.springcloud.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author wansheng
 * @createDate 2022/7/26 19:32
 */
public class CustomHandle {
    public static String handleTest(BlockException exception){
        return "通用处理类测试方法！==>系统繁忙！";
    }
}
