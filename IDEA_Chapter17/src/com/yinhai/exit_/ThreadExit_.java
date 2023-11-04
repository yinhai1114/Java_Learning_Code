package com.yinhai.exit_;

/**
 * @author 银海
 * @version 1.0
 */
public class ThreadExit_ {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        System.out.println("主线程休眠5秒");
        //如果希望主线程去控制t1的线程终止，就需要修改loop变量
        //让t1退出run方法，从而终止t1线程 - > 通知方式
        try {//让主线程休眠10秒再退出Thread线程
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);
    }
}
class T extends Thread{
    private int count = 0;

    //设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {

            try {
                Thread.sleep(50);// 让当前线程休眠50ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中...." + (++count));
        }

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
