package com.yinhai.innerclass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //1.传递的是匿名内部类 传给了alarmClock
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();//动态绑定，使用的ring是对象的类内的ring
    }
}