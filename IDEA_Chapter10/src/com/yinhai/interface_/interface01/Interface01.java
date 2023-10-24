package com.yinhai.interface_.interface01;

public class Interface01 {
    public static void main(String[] args) {
        //创建手机相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);//把手机接入到电脑
        System.out.println("===============");
        computer.work(camera);
    }
}
