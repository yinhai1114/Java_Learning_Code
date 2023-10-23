package com.yinhai.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        new AA();//调用一次静态代码块 然后创建的时候输出普通代码块
        new AA();//创建一个对象就输出普通代码块
        System.out.println(AA.aa);//没有创建对象 也初始化过了AA类 所以只输出10
    }
}
class AA{
    static int aa = 10;
    static {
        System.out.println("AA的静态代码块");
    }
    {
        System.out.println("AA的代码块");
    }
    public AA(){
        System.out.println("AA无参构造器");
    }
}
