package com.liujiazhen.study.interfacejdk8;

import java.time.LocalDateTime;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/5/5 16:29
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/5/5      LJZ     v1.0.0      create
 */
public class InterfaceTest implements Demo1, Demo2 {

    private LocalDateTime localDateTime;

    @Override
    public String getStr() {
        return Demo1.test3();
    }

    public String test3() {
        return null;
    }
}

interface Demo1 {
    default String getStr() {
        return "a";
    }

    default String test2() {
        return "test";
    }

    static String test3() {
        return "test3";
    }
}

interface Demo2 {
    default String getStr() {
        return "b";
    }
}
