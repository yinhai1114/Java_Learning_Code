package com.yinhai.threaduse;

/**
 * @author 银海
 * @version 1.0
 * 通过实现接口Runnable来开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); 不能直接调用start方法，该接口只有run方法
        Thread thread = new Thread(dog);//创建一个Thread对象，把实现了dog对象放入Thread
        thread.start();
       // Tiger tiger = new Tiger();//实现了 Runnable
       // ThreadProxy threadProxy = new ThreadProxy(tiger);
       // threadProxy.start();
    }
}
class Animal {
}

class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫....");
    }
}

//线程代理类 , 模拟了一个极简的Thread类
class ThreadProxy implements Runnable {//你可以把Proxy类当做 ThreadProxy

    private Runnable target = null;//属性，类型是 Runnable

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定（运行类型Tiger）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法时真正实现多线程方法
    }

    public void start0() {
        run();
    }
}

class Dog implements Runnable{//实现Runnable接口开发线程
    int time = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪" + ++time + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time == 10){
                break;
            }
        }
    }
}