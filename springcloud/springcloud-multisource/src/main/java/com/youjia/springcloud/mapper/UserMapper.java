package com.youjia.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youjia.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: UserMapper
 * @Create: 22/4/16 14:52
 * @Version: 1.0
 */

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
