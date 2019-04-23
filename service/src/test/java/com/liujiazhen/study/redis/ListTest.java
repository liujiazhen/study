package com.liujiazhen.study.redis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/23 11:01
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/23      LJZ     v1.0.0      create
 */


public class ListTest {
    @Test
    public void Test() {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        list.forEach(System.out::println);
    }
}
