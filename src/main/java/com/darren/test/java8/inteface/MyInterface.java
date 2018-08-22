package com.darren.test.java8.inteface;

public interface MyInterface {

    default String getName() {
        return "MyInterface";
    }

    public static String staticMethod() {
        return "static method";
    }
}
