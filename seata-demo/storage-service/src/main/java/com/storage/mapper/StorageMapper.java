package com.storage.mapper;

import com.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author gongsl
 */
public interface StorageMapper extends BaseMapper<Storage> {

    @Update("update storage_tbl set count = count - #{count} where commodity_code = #{code}")
    int deduct(@Param("code") String commodityCode, @Param("count") int count);
}
