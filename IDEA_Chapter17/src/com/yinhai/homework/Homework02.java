package com.yinhai.homework;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        Thread thread1 = new Thread(bank);
        Thread thread2 = new Thread(bank);
        thread1.start();
        Thread.sleep(200);
        thread2.start();

    }
}

class Bank implements Runnable {
    private int bakAccount = 10000;

    public int getBakAccount() {
        return bakAccount;
    }

    @Override
    public void run() {
        //1. 这里使用 synchronized 实现了线程同步
        //2. 当多个线程执行到这里时，就会去争夺 this对象锁
        //3. 哪个线程争夺到(获取)this对象锁，就执行 synchronized 代码块, 执行完后，会释放this对象锁
        //4. 争夺不到this对象锁，就blocked ，准备继续争夺
        //5. this对象锁是非公平锁.

        while (true) {
            synchronized (this) {
                if (bakAccount <= 0) {
                    System.out.println("取完");
                    break;
                }

                System.out.println(Thread.currentThread().getName() + "取出1000余额剩余" + (bakAccount -= 1000));
            }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}