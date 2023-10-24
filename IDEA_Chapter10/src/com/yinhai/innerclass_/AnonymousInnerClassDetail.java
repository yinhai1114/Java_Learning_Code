package com.yinhai.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1 = 99;
    public void f1(){
        //床加一个给予类的匿名内部类
        Person p = new Person(){
            public void hi(){
                System.out.println("匿名内部类重写了hi方法" + n1);
            }
        };//注意要带分号
        p.hi();//动态绑定，运行类型是Outer$5

        //也可以直接调用
        new Person(){
            public void hi(){
                System.out.println("匿名内部类重写了hi方法,hhhhhh");
            }
        }.hi();//其实更简单来说 new后到.hi()前的一长串其实就是一个运行类型 相当于new Person();然后这个Person符合匿名的规则
        //于是乎只在底层创建，不符合就是调用显式的Person，本质是多态

    }
}
class Person{
    public void hi(){
        System.out.println("Person hi");
    }
}