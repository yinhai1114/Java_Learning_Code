package com.yinhai.interface_.interface02;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法
    public void hi();//在接口中可以省略abstract关键字
    //jdk 8 后可以有默认实现方法，但是需要使用default关键字修饰
    default public void ok() {
        System.out.println("OK");
    }
    //在jdk8后可以有静态方法
}
