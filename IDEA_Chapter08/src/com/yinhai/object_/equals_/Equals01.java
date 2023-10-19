package com.yinhai.object_.equals_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        System.out.println(a == c);//ture or false ? ture,because a and c reference to same object
        System.out.println(b == c);//same above
        B d = a;//transition up
        System.out.println(d == a);//same above,have same as run type so point to same address
        "hello".equals("abc");//with cursor over the method,enter Ctrl + B
        Integer integer = new Integer(5);

    }
}
class A extends B{

}
class B{

}
