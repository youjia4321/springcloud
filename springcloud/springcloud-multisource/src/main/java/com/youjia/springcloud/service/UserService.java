package com.youjia.springcloud.service;

import com.youjia.springcloud.annotion.DataSource;
import com.youjia.springcloud.pojo.User;
import com.youjia.springcloud.mutidatesource.DSEnum;
import com.youjia.springcloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: UserService
 * @Create: 22/4/16 15:04
 * @Version: 1.0
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    public User findById(Integer id) {
        return userMapper.selectById(id);
    }

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    @DataSource(name = DSEnum.DATA_SOURCE_BIZ)
    public User findByIdBiz(Integer id) {
        return userMapper.selectById(id);
    }

    /**
     * 新增用户
     * @param user
     */
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    /**
     * 修改用户
     * @param user
     */
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    /**
     * 删除用户
     * @param id
     */
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

}
