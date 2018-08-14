package com.darren.test.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestLambda {
    private static List<Employee> employees;

    @BeforeClass
    public static void before() {
        employees = Arrays.asList(new Employee("张三", 18, 9999.99), new Employee("李四", 38, 5555.99),
                new Employee("王五", 50, 6666.66), new Employee("赵六", 16, 3333.33), new Employee("田七", 8, 7777.77));

    }

    // 匿名内部类
    @Test
    public void test1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return Integer.compare(o1, o2);
            }
        };

        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    // Lambda 表达式
    @Test
    public void test2() {
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    // 获取公司员工年龄大于35岁的员工
    @Test
    public void test3() {
        List<Employee> filterEmployees = this.filterEmployees(employees);
        for (Employee emp : filterEmployees) {
            System.out.println(emp);
        }
    }

    private List<Employee> filterEmployees(List<Employee> list) {
        List<Employee> emps = new ArrayList<Employee>();

        for (Employee emp : list) {
            if (emp.getAge() > 35) {
                emps.add(emp);
            }
        }

        return emps;
    }

    // 优化方式一,策略设计模式
    private List<Employee> filterEmployees(List<Employee> list, MyPredicate<Employee> predicate) {
        List<Employee> emps = new ArrayList<Employee>();

        for (Employee emp : list) {
            if (predicate.test(emp)) {
                emps.add(emp);
            }
        }

        return emps;
    }

    // 获取公司员工年龄大于35岁的员工 ，优化方式一,策略设计模式
    @Test
    public void test4() {
        List<Employee> filterEmployees = this.filterEmployees(employees, new FilterEmployeeForAge());
        for (Employee emp : filterEmployees) {
            System.out.println(emp);
        }
    }

    // 优化方式二,匿名内部类
    @Test
    public void test5() {
        List<Employee> filterEmployees = this.filterEmployees(employees, new MyPredicate<Employee>() {

            @Override
            public boolean test(Employee emp) {
                return emp.getAge() > 35;
            }
        });
        for (Employee emp : filterEmployees) {
            System.out.println(emp);
        }

    }

    // 优化方式三,Lambda表达式
    @Test
    public void test6() {
        List<Employee> filterEmployees = this.filterEmployees(employees, (e) -> e.getAge() > 35);
        filterEmployees.forEach(System.out::println);
        System.out.println("====");
        filterEmployees.forEach((e) -> System.out.println(e));
        System.out.println("====");
        for (Employee emp : filterEmployees) {
            System.out.println(emp);
        }

    }

    // 优化方式四,
    @Test
    public void test7() {
        employees.stream()
                 .filter((e) -> e.getAge() > 35)
                 .limit(1)
                 .forEach(System.out::println);
    }
}
