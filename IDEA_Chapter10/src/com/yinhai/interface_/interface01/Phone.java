package com.yinhai.interface_.interface01;

//Phone 类实现UsbInterface
//解读1.即Phone类需要实现UsbInterface接口 规定/声明的方法
public class Phone implements UsbInterface{
    //实现接口，本质就是把接口的方法实现，相当于在规范内实现我自己类的方法
    public void start(){
        System.out.println("手机开始工作...");
    }
    public void stop(){
        System.out.println("手机停止工作...");
    }
}
