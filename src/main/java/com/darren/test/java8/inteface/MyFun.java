package com.darren.test.java8.inteface;

public interface MyFun {

    default String getName() {
        return "MyFun";
    }
}
