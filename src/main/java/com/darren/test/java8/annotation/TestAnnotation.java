package com.darren.test.java8.annotation;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 
 * 重复注解与类型注解
 *
 */
public class TestAnnotation {

    // java8以前不允许重复注解
    // @MyAnnotation("Hello")
    // @MyAnnotation("Hello1")
    // public void show(){
    //
    // }

    @MyAnnotation1("Hello")
    @MyAnnotation1("World")
    @MyAnnotation1
    public void show1() {

    }

    public void show2(@MyAnnotation("Hello") String str) {
        System.out.println(str);
    }

    @Test
    public void test1() throws NoSuchMethodException, SecurityException {
        Class<TestAnnotation> clazz = TestAnnotation.class;
        Method method = clazz.getMethod("show1");
        MyAnnotation1[] annotations = method.getAnnotationsByType(MyAnnotation1.class);
        for (MyAnnotation1 myAnnotation1 : annotations) {
            System.out.println(myAnnotation1.value());
        }
    }

    @Test
    public void test2() throws NoSuchMethodException, SecurityException {
        Class<TestAnnotation> clazz = TestAnnotation.class;
        Method method = clazz.getMethod("show2", String.class);
        AnnotatedType type = method.getAnnotatedReceiverType();
        System.out.println(type.getType().getTypeName());
        System.out.println(type.getType());
        
        MyAnnotation ss = (MyAnnotation) type.getType();
        System.out.println(ss.value());
        MyAnnotation[] annotations = type.getAnnotationsByType(MyAnnotation.class);
        System.out.println(annotations.length);
//        for (MyAnnotation myAnnotation : annotations) {
//            System.out.println(myAnnotation.value());
//        }
    }
}
