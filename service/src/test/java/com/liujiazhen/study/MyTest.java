package com.liujiazhen.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/5/7 10:48
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/5/7      LJZ     v1.0.0      create
 */

public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        long time = new Date().getTime();
        System.out.println(time);
        String serialNo = String.valueOf(new Date().getTime()).substring(0, 7);
        System.out.println(serialNo);

        int i = 0;
        int x = (++i) + (++i);
        System.out.println(x);
    }
}
