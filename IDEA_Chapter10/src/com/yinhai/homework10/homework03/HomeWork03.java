package com.yinhai.homework10_.homework03;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();//动态绑定
        Animal dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{
    public void shout(){
        System.out.println("猫喵喵叫....");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("狗汪汪叫....");
    }
}
