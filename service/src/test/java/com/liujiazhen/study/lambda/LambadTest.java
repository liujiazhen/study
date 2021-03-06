package com.liujiazhen.study.lambda;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright © 2019 LiuJiaZhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/27 13:14
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/27      LJZ     v1.0.0      create
 */
public class LambadTest {

    @Test
    public void test() {
        String queryDate = "item=book&data=2019-01-01&price=200&name=";

        Map<String, String> map = Stream.of(queryDate.split("&")).map(s -> s.split("=")).collect(Collectors.toMap(s -> s[0], s -> s.length == 1 ? "" : s[1]));
        System.out.println(map);
    }

    @Test
    public void test2() {
        List<Integer> list = books().stream().map(Book::getId).collect(Collectors.toList());
        System.out.println(list);

        String collect = books().stream().map(book -> "'" + book.getId() + "'").collect(Collectors.joining(",", "(", ")"));
        System.out.println(collect);
    }

    @Test
    public void test3() {
        Set<String> list = books().stream().map(Book::getType).collect(Collectors.toSet());
        System.out.println(list);
    }

    @Test
    public void test4() {
        Comparator<Book> comparator = Comparator.comparingDouble(Book::getPirce).reversed();
        books().stream().sorted(comparator).forEach(System.out::println);
    }

    @Test
    public void test5() {
        String collect = books().stream().map(book -> book.getType() + "").distinct().collect(Collectors.joining(","));
        System.out.println(collect);

        String collect1 = Stream.of(collect.split(",")).map(s -> "'" + s + "'").collect(Collectors.joining(",", "(", ")"));
        System.out.println(collect1);
    }

    private List<Book> books() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "tomcat", 70d, "服务器", LocalDate.parse("2014-05-17")));
        books.add(new Book(2, "jetty", 60d, "服务器", LocalDate.parse("2015-12-01")));
        books.add(new Book(3, "nginx", 65d, "服务器", LocalDate.parse("2016-10-17")));
        books.add(new Book(4, "java", 66d, "编程语言", LocalDate.parse("2011-04-09")));
        books.add(new Book(4, "ruby", 80d, "编程语言", LocalDate.parse("2013-05-09")));
        books.add(new Book(6, "php", 40d, "编程语言", LocalDate.parse("2014-08-06")));
        books.add(new Book(7, "html", 44d, "编程语言", LocalDate.parse("2011-01-06")));
        books.add(new Book(8, "oracle", 150d, "数据库", LocalDate.parse("2013-08-09")));
        books.add(new Book(9, "mysql", 66d, "数据库", LocalDate.parse("2015-04-06")));
        books.add(new Book(10, "ssh", 70d, "编程语言", LocalDate.parse("2016-12-04")));
        books.add(new Book(11, "设计模式", 81d, "其他", LocalDate.parse("2017-04-06")));
        books.add(new Book(12, "重构", 62d, "其他", LocalDate.parse("2012-04-09")));
        books.add(new Book(13, "敏捷开发", 72d, "其他", LocalDate.parse("2016-09-07")));
        books.add(new Book(14, "从技术到管理", 42d, "其他", LocalDate.parse("2016-02-19")));
        books.add(new Book(15, "算法导论", 66d, "其他", LocalDate.parse("2010-05-08")));
        books.add(new Book(16, "oracle 12c", 150d, "数据库", LocalDate.parse("2017-05-08")));
        return books;
    }

    @Test
    public void test6() {
        books().stream().filter(book -> book.getPirce() > 70).sorted(Comparator.comparing(Book::getLocalDate)).forEach(System.out::println);
    }

    @Test
    public void test7() {

        books().stream().sorted(Comparator.comparing(Book::getLocalDate).reversed()).forEach(System.out::println);
    }


}

class MyTest {
    public static double PI_MY = 3.14D;

    @SafeVarargs
    private static String getStrUpper(List<String>... str) {
        return "liujiazhen";
    }
}
