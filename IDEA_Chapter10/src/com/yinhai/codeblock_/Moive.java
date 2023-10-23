package com.yinhai.codeblock_;

public class Moive {
    private String name;
    private double price;
    private String director;
    //1）下面的三个构造器都有相同的语句
    //2）这样代码看起来比较冗余
    //3）可以把相同代码放到一个代码块中
    //4)这样当我们不管调用哪个构造器都会先调用代码块的内容
    //5)代码块的调用优先于构造器..
    {
        System.out.println("display open...");
        System.out.println("advertising...");
        System.out.println("movie start...");
    }
    public Moive(String name) {
        System.out.println("Moive(String)构造器被调用");
        this.name = name;
    }

    public Moive(String name, double price) {
        System.out.println("Moive(String double)构造器被调用");
        this.name = name;
        this.price = price;
    }

    public Moive(String name, double price, String director) {
        System.out.println("Moive(String double String)构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
    //方法重载
}
