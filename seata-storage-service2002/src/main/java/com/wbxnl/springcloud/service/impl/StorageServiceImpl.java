package com.wbxnl.springcloud.service.impl;

import com.wbxnl.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:31
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageService storageService;

    @Override
    public boolean update(Long id, Integer count) {
        return storageService.update(id,count);
    }
}
