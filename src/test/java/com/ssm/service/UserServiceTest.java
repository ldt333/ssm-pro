package com.ssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ssm.model.User;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = { "classpath:applicationContext.xml" }) // 加载配置文件
public class UserServiceTest {

    @Autowired
    private UserService userService;
    
    @Test
    public void testSelectById() {
        User user = userService.selectById(1);
        System.out.println("========================>");
        System.out.println(user);
    }
    
}
