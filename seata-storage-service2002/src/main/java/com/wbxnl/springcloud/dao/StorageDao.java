package com.wbxnl.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wansheng
 * @createDate 2022/7/27 20:27
 */
@Mapper
public interface StorageDao {
    public boolean update(@Param("id")Long id,@Param("count")Integer count);
}
