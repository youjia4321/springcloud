package com.youjia.springcloud;

import com.youjia.springcloud.pojo.User;
import com.youjia.springcloud.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: UserServiceTest
 * @Create: 22/4/16 15:06
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    private Logger log = Logger.getLogger(this.getClass());


    @Autowired
    private UserService userService;

    @Test
    public void test() {
        // core数据库中的用户id=1
        User user = userService.findById(1);
        Assert.assertEquals(user.getUsername(), "admin");
        // biz数据库中的用户id=1
        User user1 = userService.findByIdBiz(1);
        Assert.assertEquals(user1.getUsername(), "admin1");
    }

}
