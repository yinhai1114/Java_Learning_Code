package com.yinhai.innerclass_;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Ourter08 ourter08 = new Ourter08();
        ourter08.t1();
    }
}
class Ourter08{
    private int n1 = 10;
    public String name = "张三";
    //成员内部类是定义在外部内的成员位置上
    //可以添加任意访问修饰符(public 默认 protected private)
    class Inner08{
        public void say(){
            //可以访问外部类的所有成员，包含私有的
            System.out.println("Outer01的n1" + n1 + "Outer01的name" + name);
        }
    }
    //写一个方法
    public void t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}