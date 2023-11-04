package com.yinhai.homework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.Scanner;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
        new Thread(printNum).start();
        new Thread(new MyListener(printNum)).start();
    }
}

class PrintNum implements Runnable{
    private boolean loop = true;//通知方式，需要定义一个变量接受退出指令

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            synchronized (this) {
                try {
                    System.out.println((int)(Math.random()*100));//随机数
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("PrintNum进程退出");
    }
}
class MyListener implements Runnable{
    private PrintNum printNum;//需要定义一个printNum，面向对象保证我们改的和运行的是同一个对象
    Scanner myScanner = new Scanner(System.in);

    public MyListener(PrintNum printNum) {
        this.printNum = printNum;//构造器传入Print的对象
    }

    @Override
    public void run() {
        synchronized (this){
            while (true) {
                System.out.println("Q退出，等待用户输入...");
                char a = myScanner.next().charAt(0);
                if (a == 'Q') {
                    printNum.setLoop(false);
                    System.out.println("Listener进程退出");
                    break;
                }else{
                    System.out.println("退出失败 输入Q退出");
                }
            }
        }
    }
}