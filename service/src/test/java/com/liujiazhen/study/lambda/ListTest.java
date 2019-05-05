package com.liujiazhen.study.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        Iterator<String> iterator = list.iterator();
        iterator.forEachRemaining(System.out::println);

        list.forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 5, 9);
        integerList.forEach(System.out::println);
        System.exit(998);
        System.exit(2);
    }

    @Test
    public void test3() {
        List<Integer> integerList = Arrays.asList(100, 200, 300, 500, 900);
        Stream<Integer> integerStream = integerList.stream().map((cost) -> cost + 2 * cost);
        integerStream.forEach(System.out::println);
    }

    @Test
    public void test4() {
        List<String> list = Arrays.asList("LIUJIAZHEN", "zhangsan", "lisi");
        String collect = list.stream().map(String::toLowerCase).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    @Test
    public void test5() {
        List<String> list = Arrays.asList("liujiazhen", "zhangsan", "lisi");
        String collect = String.join(",", list);
        System.out.println(collect);
    }

    @Test
    public void test6() {
        GreetingService service = message -> System.out.println(message + "+hello");
        service.sayMessage("liujiazhen");
    }

    interface GreetingService {
        void sayMessage(String message);
    }

}
