package com.liujiazhen.study.mybatis;

import com.liujiazhen.study.api.system.model.User;
import com.liujiazhen.study.api.system.service.UserService;
import com.liujiazhen.study.service.ServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/29 13:46
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/29      LJZ     v1.0.0      create
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
public class MybatisTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUser() {
        User userById = userService.getUserById("17");
        System.out.println(userById);
    }

    @Test
    public void getUserList() {
        User user = new User();
        List<User> userByParamList = userService.getUserByParamList(user);
        userByParamList.forEach(System.out::println);
    }
}
