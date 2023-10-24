package com.yinhai.interface_.interfacepoly;

import com.yinhai.interface_.interface01.Phone;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            if(usbs[i] instanceof Phone_){//判断运行类型是phone
                ((Phone_) usbs[i]).call();//向下转型
            }
        }
    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
    public void call(){
        System.out.println("手机打电话中");
    }
}

class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}
