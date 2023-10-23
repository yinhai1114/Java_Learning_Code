package com.yinhai.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A {
    private static int n1 = getN1();//1.创建空间的时候会对static执行初始化，然后调用getN1
    private int n2 = getN2();//3.静态初始化完后才执行普通的初始化
    public A(){
        System.out.println("A的无参构造器被调用");
    }
    //2.然后返回100
    static {//2.在创建空间的时候执行完静态属性初始化后就执行该代码块
        System.out.println("A的静态代码块");
    }
    {//3.初始化静态完后才到这里
        System.out.println("A的代码块");
    }
    public static int getN1(){
        System.out.println("getN1被调用");//1.输出
        return 100;
    }
    public int getN2(){//普通方法
        System.out.println("getN2被调用");
        return 10;
    }
}
