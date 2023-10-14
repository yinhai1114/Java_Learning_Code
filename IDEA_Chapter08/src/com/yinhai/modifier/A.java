package com.yinhai.modifier;

public class A {
    public int n1 = 1000;
    protected int n2 = 200;
    int n3 = 20;
    private int n4 = 12;

    public void m1() { //该方法可以访问4个属性，即同类 √
        System.out.println("n1 " + n1 + " n2 "  + n2 + " n3 " + n3 + " n4 " + n4);
    }
}
