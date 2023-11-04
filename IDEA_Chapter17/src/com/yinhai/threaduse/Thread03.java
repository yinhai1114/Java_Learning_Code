package com.yinhai.threaduse;

/**
 * @author 银海
 * @version 1.0
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);
        thread.start();
        thread1.start();
    }
}

class T1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("hello,world" + ++i + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 10) {
                break;
            }
        }
    }
}

class T2 implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + ++i + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5) {
                break;
            }
        }
    }
}