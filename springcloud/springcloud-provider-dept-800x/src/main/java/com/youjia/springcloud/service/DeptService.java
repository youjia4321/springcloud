package com.youjia.springcloud.service;

import com.youjia.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: DeptService
 * @Create: 22/1/25 22:28
 * @Version: 1.0
 */
public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();

}
