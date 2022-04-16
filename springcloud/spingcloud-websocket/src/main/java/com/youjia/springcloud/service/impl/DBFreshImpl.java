package com.youjia.springcloud.service.impl;

import com.youjia.springcloud.mapper.DeptMapper;
import com.youjia.springcloud.service.DBFresh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DBFreshImpl
 * @Create: 22/4/15 13:50
 * @Version: 1.0
 */

@Service
public class DBFreshImpl implements DBFresh {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Object doGetDeptInfo() {
        return deptMapper.queryAll();
    }

}
