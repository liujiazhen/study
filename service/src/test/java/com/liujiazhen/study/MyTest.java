package com.liujiazhen.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        get(null);
    }

    public static void get(Fu str) {
        System.out.println(1111);
    }

    private static void get(Zi tt) {
        System.out.println(222);
    }
}

class Fu {

}

class Zi extends Fu {

}
