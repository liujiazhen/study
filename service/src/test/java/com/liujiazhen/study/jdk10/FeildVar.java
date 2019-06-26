package com.liujiazhen.study.jdk10;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/5/5 15:16
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/5/5      LJZ     v1.0.0      create
 */
public class FeildVar {
    @Test
    public void test1() {
        var lll = "";
        var x = 1;
        x++;
        System.out.println(x);

        var list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        System.out.println(list);
    }

    @Test
    public void test2() {
        var productInfo = new Object() {
            String name = "Apple";
            int total = 30;
        };
        System.out.println("name = " + productInfo.name + ", total = " + productInfo.total);
    }

    @Test
    public void test3() {
        final int[] x = {1};
        while (true) {
            Runnable runnable = () -> {
            };
            new Thread(runnable).start();
        }
    }
}
