package com.yinhai.generic;

import java.util.ArrayList;

/**
 * @author 银海
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("xiaoming",10));
        arrayList.add(new Dog("xiaohua",5));
        arrayList.add(new Dog("xiaownag",20));

        //假如我们的使用过程，不小心加入了一只猫
        arrayList.add(new Cat("hello" , 15));
        for (Object o : arrayList) {
            Dog dog = (Dog)o;
            System.out.println(dog.getName() + " " +dog.getAge());
        }
    }
}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}