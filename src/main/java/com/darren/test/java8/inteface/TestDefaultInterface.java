package com.darren.test.java8.inteface;

public class TestDefaultInterface {

    public static void main(String[] args) {

        SubClass sub = new SubClass();

        // test1
        // 类优先原则
        System.out.println(sub.getName());// MyClass

        // test2
        // 直接使用默认方法
        System.out.println(sub.getName());// MyFun

        // test3
        // 实现多个接口的时候，要指定实现哪个接口的默认方法
        System.out.println(sub.getName());// MyInterface

        
        //接口中静态方法测试
        System.out.println(MyInterface.staticMethod());
    }
}
