package com.yinhai.synchronized_;

/**
 * @author 银海
 * @version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket02 sellTicket002 = new SellTicket02();
        Thread thread1 = new Thread(sellTicket002);
        Thread thread2 = new Thread(sellTicket002);
        Thread thread3 = new Thread(sellTicket002);
        thread1.start();
        thread2.start();
        thread3.start();
        while (true) {
            System.out.println(thread1.getName() + " 状态 " + thread1.getState());
            System.out.println(thread2.getName() + " 状态 " + thread2.getState());
            System.out.println(thread3.getName() + " 状态 " + thread3.getState());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (sellTicket002.getTicketNum() <= 0) {
                System.out.println("End program");
                break;
            }
        }
    }
}

//实现接口方法，使用synchronized实现线程同步
class SellTicket02 implements Runnable {
    private int ticketNum = 10;
    Object object = new Object();

    //同步方法（静态的）的锁为当前类本身
    //1. public synchronized static void m1() {} 锁是加在 SellTicket03.class

    public synchronized static void m1() {

    }
    //2. 如果在静态方法中，要实现一个同步代码块，需要像以下方式处理
    public static void m2() {
        synchronized (SellTicket02.class) {
            System.out.println("m2");
        }
    }
    //同步方法，同一时间只有一个线程来执行sellTick方法
    public /*synchronized*/ boolean sellTick() {
        //2.这时锁在this对象，也可以在代码块上写synchronize，同步代码块
        synchronized (/*this*/ object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                return false;
            }
            System.out.println("该窗口" + Thread.currentThread().getName() + "卖出了一张票，剩余 " + --ticketNum + "张");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @Override
    public void run() {

        while (sellTick()) {
        }
    }

    public int getTicketNum() {
        return ticketNum;
    }
}

//使用Thread方式
// new SellTicket01().start();
// new SellTicket01().start();
class SellTicket01 extends Thread {

    private static int ticketNum = 100;//让多个线程共享 ticketNum

    //这样锁不住，无法保证锁的对象是同一个
    public void m1() {
        synchronized (this) {
            System.out.println("hello");
        }
    }
}