package com.yinhiai.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(9000);
        System.out.println(person.info());
        //
        Person person1 = new Person("jaDDDDDDck", 2000, 500000);
        //这样子构造就会绕过setXxx
    }
}

class Person {
    public String name;
    private int age;
    private double salary;
    //  手打太慢了 使用alt +ins插入getter and setter
    //根据要求完善

    //无参构造器
    public Person() {
    }

    //三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以在构造器里使用set方法
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的检测
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("输入有误 设为默认");
            this.name = "null";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("设置的年龄有误，需要在 1 - 120之间，已设为默认18");
            this.age = 18;
        }

    }

    public double getSalary() {
        //增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
        //因为是同一个类 所以可以访问
    }
}