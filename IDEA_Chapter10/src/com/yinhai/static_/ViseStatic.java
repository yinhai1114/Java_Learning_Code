package com.yinhai.static_;

public class ViseStatic {
    public static void main(String[] args) {
        //类名.类变量名
        System.out.println(A.name);
        A a = new A();
        System.out.println("a.name=" + a.name);

    }
}
class A{
    public static String name = "name yinhai";
    private int n1 = 100;
    private static int n2 = 200;
    public void say(){

    }
    public void ok(){
        System.out.println(n1);
        System.out.println(n2);
        say();
        hello();
    }
    public static void hello(){
        System.out.println(n2);
        System.out.println(A.n2);

    }
}