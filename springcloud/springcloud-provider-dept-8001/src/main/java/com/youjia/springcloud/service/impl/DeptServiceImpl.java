package com.youjia.springcloud.service.impl;

import com.youjia.springcloud.mapper.DeptMapper;
import com.youjia.springcloud.pojo.Dept;
import com.youjia.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptServiceImpl
 * @Create: 22/1/25 22:28
 * @Version: 1.0
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryById(long id) {
        return deptMapper.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
