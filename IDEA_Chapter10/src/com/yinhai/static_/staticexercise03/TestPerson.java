package com.yinhai.static_.staticexercise03;

public class TestPerson {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
    }
}

class Person{
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        // this.total = total; 类方法中不能带有this语句
        Person.total = total;
    }
    public Person(){//无参构造器 构造器本质是成员方法 可以调用成员变量或类变量
        total++;
        id = total;
    }
}
