package com.darren.test.java8.inteface;

//类优先原则
//类中有方法和接口中的默认方法重名，优先使用类中的方法

//方式1
//public class SubClass extends MyClass implements MyFun{
//
//}


//方式2
//直接使用默认方法
public class SubClass implements MyFun{

}

//方式3
// 实现多个接口的时候，要指定实现哪个接口的默认方法
//public class SubClass implements MyFun, MyInterface{
//
//    @Override
//    public String getName() {
//        return MyInterface.super.getName();
//    }
//
//}