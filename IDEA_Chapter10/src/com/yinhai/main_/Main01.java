package com.yinhai.main_;

import sun.applet.Main;

public class Main01 {
    private static String name = "yinhai";
    private int n1 = 1000;
    public static void main(String[] args) {
        //可以直接使用nam
        //1.静态方法可以访问本类的静态成员
        System.out.println("name=" + name);
        hi();
        //2.类方法无法访问成员变量
        // System.out.println(n1); //报错
        // ok();//报错
        //3.要访问本类的成员变量或者成员变量需要实例化一个对象才能访问
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.ok();
    }
    public void ok(){
        System.out.println("ok");
    }
    public static void hi(){
        System.out.println("hello");
    }

}
