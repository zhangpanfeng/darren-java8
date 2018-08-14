package com.darren.test.java8.lambda;

/**
 * 函数式接口: 只有一个抽象方法的接口
 * 
 * @author Darren
 *
 * @param <T>
 */
@FunctionalInterface
public interface MyPredicate<T> {

    public boolean test(T t);
    
    default void xxx(){
        
    }

}
