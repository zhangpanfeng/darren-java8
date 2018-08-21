package com.darren.test.java8.lambda;

public class Employee1 {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee1() {
    }

    public Employee1(String name) {
        this.name = name;
    }

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

}
