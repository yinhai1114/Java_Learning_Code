package com.yinhai.interface_.interface02;

public class Interface02 {
    public static void main(String[] args) {

    }
}
//1.如果一个类implements实现接口
//2.需要该接口的所有抽象方法都实现
class A implements AInterface{
    public void hi(){
        System.out.println("hi().....");
    }
}