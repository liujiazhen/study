package com.liujiazhen.study.lambda;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Copyright © 2019 LiuJiazhen
 * <p>
 * description:
 *
 * @author LiuJiazhen
 * @version v1.0.0
 * @date 2019/4/29 14:30
 * <p>
 * Modification History
 * Date     Author      Version     Description
 * ---------------------------------------------------------*
 * 2019/4/29      LJZ     v1.0.0      create
 */
public class LambdaTest2 {
    @Test
    public void test1() {

        String str = "liujiazhen=utf-8&liujiazhen=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=lambda&oq=type-aliases-package%2520%25E9%2580%259A%25E9%2585%258D%25E7%25AC%25A6";
        String[] split = str.split("&");

        Map<String, String> collect = Stream.of(split).map(s -> s.split("=")).collect(Collectors.toMap(ss -> ss[0], ss -> ss[1], (v1, v2) -> v1));

        Set<Map.Entry<String, String>> entries = collect.entrySet();

        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry.getKey() + "<==>" + stringStringEntry.getValue()));
    }

    private static String readData(String message) throws IOException {
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        try (br) {
            return br.readLine();
        }
    }

    @Test
    public void test2() throws Exception {
        String test = readData("test1");
        String test2 = readData("test2");
        System.out.println(test);
    }

}
