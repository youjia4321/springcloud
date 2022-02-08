package com.youjia.springcloud.mapper;

import com.youjia.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptMapper
 * @Create: 22/1/25 22:16
 * @Version: 1.0
 */

@Mapper
@Repository
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();

}
