package com.liujiazhen.study.jdk9.other;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 * Java 9 钻石操作符(Diamond Operator)
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/5/5 14:48
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/5/5      LJZ     v1.0.0      create
 */

public class DiamondOperator {
    public static void main(String[] args) {
        Handler<Integer> intHandler = new Handler<Integer>(1) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler.handle();

        Handler<? extends Number> intHandler1 = new Handler<Number>(2) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler1.handle();

        Handler<?> handler = new Handler<Object>("test") {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        handler.handle();
    }
}

abstract class Handler<T> {
    T content;

    Handler(T content) {
        this.content = content;
    }

    abstract void handle();
}