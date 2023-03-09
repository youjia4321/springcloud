package com.youjia.springcloud.mapper;

import com.youjia.springcloud.domain.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SysOperLogMapper
 * @date 2023/3/9 16:00
 */

@Mapper
public interface SysOperLogMapper {

    void save(SysOperLog sysOperLog);

    SysOperLog select(Long operIds);
}
