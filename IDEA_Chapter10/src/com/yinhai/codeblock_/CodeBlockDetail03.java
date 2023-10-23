package com.yinhai.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        //1.super(); 再向上是Object类 没东西 无输出
        //2.调用本类的普通代码块 （1）输出AAA的普通代码块
        System.out.println("AAA()构造器被调用");//（2）
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");//（3）
    }
    public BBB() {
        //1.super();（1）
        //2.调用本类的普通代码块
        System.out.println("BBB()构造器被调用");//（4）
    }
}