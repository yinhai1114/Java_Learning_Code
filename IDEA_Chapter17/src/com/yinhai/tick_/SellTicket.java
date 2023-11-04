package com.yinhai.tick_;

/**
 * @author 银海
 * @version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        // SellTicket01 sellTicket01 = new SellTicket01();
        // SellTicket01 sellTicket02 = new SellTicket01();
        // SellTicket01 sellTicket03 = new SellTicket01();
        //继承Thread类方法
        // sellTicket01.start();
        // sellTicket02.start();
        // sellTicket03.start();

        //使用实现Runnable接口方式
        SellTicket02 sellTicket002 = new SellTicket02();
        new Thread(sellTicket002).start();
        new Thread(sellTicket002).start();
        new Thread(sellTicket002).start();
    }
}
class SellTicket01 extends Thread{
    private static int ticketNum = 100;
    @Override
    public void run() {
        while (true){
            if(ticketNum <= 0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("该窗口" + Thread.currentThread().getName() + "卖出了一张票，剩余 " + --ticketNum + "张");
        }
    }
}
class SellTicket02 implements Runnable{
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true){
            if(ticketNum <= 0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("该窗口" + Thread.currentThread().getName() + "卖出了一张票，剩余 " + --ticketNum + "张");
        }
    }
}