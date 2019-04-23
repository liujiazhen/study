package com.liujiazhen.study.redis;

import com.liujiazhen.study.service.ServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description: redis测试
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/22 17:25
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/22      LJZ     v1.0.0      create
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
public class SpringBootRedisTest {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("v");
        stringRedisTemplate.opsForValue().set("abc", "MyTest");
        stringRedisTemplate.opsForList().leftPushAll("qq", list);
        stringRedisTemplate.opsForList().range("qwe", 0, -1);
        list.forEach(System.out::println);
    }

}
