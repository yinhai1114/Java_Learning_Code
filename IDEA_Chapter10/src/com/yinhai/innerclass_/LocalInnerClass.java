package com.yinhai.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02的hashcode" + outer02);
    }

}
class Outer02{
    private int n1 = 100;
    public void m1(){
        final class Inner02{
            private int n1 = 800;
            public void f1(){
                System.out.println("this.n1=" + n1);
                System.out.println("Outer02.this 的n1" + Outer02.this.n1);
                System.out.println("Outer02.this 的hashcode" + Outer02.this);
                System.out.println("this 的hashcode" + this);
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();//这里是inner02调用的f1
        System.out.println("inner02的hashcode" + inner02);
    }

}