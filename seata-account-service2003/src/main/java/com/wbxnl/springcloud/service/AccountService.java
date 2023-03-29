package com.wbxnl.springcloud.service;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:52
 */
public interface AccountService {
    /**
     * 修改账户余额
     * @param id
     * @param money
     * @return
     */
    public boolean update(Long id, BigDecimal money);
}
