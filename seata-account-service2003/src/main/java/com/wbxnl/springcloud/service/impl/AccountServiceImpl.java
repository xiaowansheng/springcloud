package com.wbxnl.springcloud.service.impl;

import com.wbxnl.springcloud.dao.AccountDao;
import com.wbxnl.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:54
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public boolean update(Long id, BigDecimal money) {
        return accountDao.update(id,money);
    }
}
