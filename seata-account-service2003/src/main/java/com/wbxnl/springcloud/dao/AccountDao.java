package com.wbxnl.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:50
 */
@Mapper
public interface AccountDao {
    public boolean update(@Param("id")Long id, @Param("money")BigDecimal money);
}
