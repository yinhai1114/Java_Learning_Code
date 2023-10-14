package com.yinhai.ExtendsDetail;

public class Base extends com.hspedu.ExtendsDetail.TopBase {
    public String name;
    int age;
    protected int salary;
    private int num;
    public Base(int num){
        System.out.println("父类的num形参构造器base...");
    }

//    public Base() {
//        System.out.println("父类的无参构造器base...");
//    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }
}
