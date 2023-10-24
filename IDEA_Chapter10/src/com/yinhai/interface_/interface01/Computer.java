package com.yinhai.interface_.interface01;

public class Computer {
    //编写一个方法
    public void work(UsbInterface usbInterface){//创建了个接口，用来接入对象的方法
        usbInterface.start();
        usbInterface.stop();
    }
}
