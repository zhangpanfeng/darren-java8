package com.darren.test.java8;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Integer a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);

        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "你好");
        String hello = map.get("hello");
        System.out.println(hello);
    }

}
