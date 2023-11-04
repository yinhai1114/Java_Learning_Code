package com.yinhai.threaduse;

/**
 * @author 银海
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) {
        //创建一个Cat对象当做线程使用
        Cat cat = new Cat();
        cat.start();
        //当main线程启动一个子线程 Thread-0主线程不会阻塞，会继续执行
        //这时我们的主线程和Thread 0线程都在执行
        for (int i = 1; i <= 100; i++) {
            System.out.println("主线程在执行中" + i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//当一个类继承了Thread类，该类就可以当做线程使用
class Cat extends Thread{
    int time = 0;
    @Override
    public void run() {//往往要重写run方法，Thread类实现了Runnable的接口的run方法
        while (true){
            System.out.println("喵喵" + ++time + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(time == 80){
                break;//当time到8次，线程就会退出
            }
        }
    }
}