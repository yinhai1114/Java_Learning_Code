package com.yinhai.static_;

public class ChilGame {
    public static void main(String[] args) {
        Child child0 = new Child("xiaohuang");
        Child child1 = new Child("xiaowang");
        Child child2 = new Child("xiaoming");
        Child child3 = new Child("xiaobai");
        Child child4 = new Child("xiaoqing");
        int count = 0;
        child0.joinGame();
        child0.count++;
        child1.joinGame();
        child1.count++;
        child2.joinGame();
        child2.count++;
        child3.joinGame();
        child3.count++;
        child4.joinGame();
        child4.count++;
        System.out.println("现在有" + Child.count + "个小孩加入了游戏");
        System.out.println(child0.count);
        System.out.println(child1.count);
        System.out.println(child2.count);

        //即这个变量可以用类Child访问，Child.count，也可以被所有的对象调用
        //child0.count child1.count等等
    }
}

class Child {
    private String name;
    //定义一个变量 count 是一个类变量（静态变量） static 静态
    public static int count = 0;//该对象会被所有的对象共享

    public Child(String name) {
        this.name = name;
    }

    public void joinGame() {
        System.out.println(name + "加入了游戏");

    }
}