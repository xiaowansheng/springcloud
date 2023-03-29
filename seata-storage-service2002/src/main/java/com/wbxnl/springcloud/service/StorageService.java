package com.wbxnl.springcloud.service;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:29
 */
public interface StorageService {
    /**
     * 修改库存
     * @param id
     * @param count
     * @return
     */
    public boolean update(Long id,Integer count);
}
