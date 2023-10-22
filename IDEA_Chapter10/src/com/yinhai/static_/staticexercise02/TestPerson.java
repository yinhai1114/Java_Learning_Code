package com.yinhai.static_.staticexercise02;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println(" Number of total is "+ Person.getTotalPerson());//静态方法可以直接调用
        Person p1 = new Person();
        System.out.println("Number of total is "+ Person.getTotalPerson());
    }
}

class Person{
    private int id;
    private static int total = 0;
    public static int getTotalPerson(){
        //id++;//静态方法只能调用静态属性 错误
        return total;
    }
    public Person(){//无参构造器 构造器本质是成员方法 可以调用成员变量或类变量
        total++;
        id = total;
    }
}
