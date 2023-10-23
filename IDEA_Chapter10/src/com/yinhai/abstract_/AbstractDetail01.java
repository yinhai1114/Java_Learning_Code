package com.yinhai.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //new A();1)抽象类不能被实例化
    }
}
abstract class A{
    // abstract int num; 4) abstract只能修饰类和方法，不能修饰属性和其它的。
}
// class B{一旦类包含了abstract方法，则这个类必须声明为abstract
//     public abstract void b();
// }