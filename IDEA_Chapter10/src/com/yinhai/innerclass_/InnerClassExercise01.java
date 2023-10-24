package com.yinhai.innerclass_;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画~~~");
            }
        });
        f1(new Picture());//传统方法
    }
    public static void f1(IL il){
        il.show();
    }
}
interface IL{
    void show();
}
class Picture implements IL{// 类 -- 接口对象 硬编程

    @Override
    public void show() {
        System.out.println("这是一幅名画....");
    }
}