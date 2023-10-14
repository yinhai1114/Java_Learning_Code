package com.yinhai.ExtendsDetail;

public class A extends com.hspedu.ExtendsDetail.Base {
    public A() {
        super(1);
        System.out.println("子类A的无参构造器...");
    }
    public A(int num) {
        super(2);
        System.out.println("子类A的num形参构造器...");
    }

    public void test(){


    }
}
