package com.yinhai.interface_.interfacedetail01;


public class InterfaceDetail01 {

    public static void main(String[] args){
        // new IA();
    }


}
interface IA{
    void say();//2.接口中所有的方法是public方法，接口中抽象方法，可以不用abstract 修饰:
    void hi();
}
class Cat implements IA{//3.一个普通类实现接口,就必须将该接口的所有方法都实现。

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class BB implements IA{//4.抽象类实现接口，可以不用实现接口的方法。

}