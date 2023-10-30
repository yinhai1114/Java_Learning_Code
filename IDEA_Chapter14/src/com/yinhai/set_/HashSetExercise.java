package com.yinhai.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 银海
 * @version 1.0
 */

public class HashSetExercise {
    public static void main(String[] args) {


        /**
         定义一个Employee类，该类包含：private成员属性name,age 要求:
         创建3个Employee 对象放入 HashSet中
         当 name和age的值相同时，认为是相同员工, 不能添加到HashSet集合中

         */
        HashSet set = new HashSet();
        Employee xiaowang = new Employee("xiaowang", 18);
        Employee xiaoming = new Employee("xiaoming", 30);
        Employee employee = new Employee("Mr.w", 30);
        Employee xiaowang2 = new Employee("xiaowang",18);
        Employee xiaowan = new Employee("xiaowan",18);
        set.add(xiaowang);
        set.add(xiaoming);
        set.add(employee);
        set.add(xiaowang2);
        set.add(xiaowan);
        System.out.println(set);

    }
}
//Employee
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.age == employee.age && this.name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
