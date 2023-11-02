package com.yinhai.generic;

import java.util.ArrayList;

/**
 * @author 银海
 * @version 1.0
 */
public class Generic02 {
    public static void main(String[] args) {
        //使用泛型来完成该代码,
        //1.当我们这样ArrayList<Dog>表示春芳到集合中的元素是Dog类型
        //2.如果编译器发现添加的类型，不满足要求就会报错
        ArrayList<Dog1> arrayList = new ArrayList<Dog1>();
        arrayList.add(new Dog1("xiaoming",10));
        arrayList.add(new Dog1("xiaohua",5));
        arrayList.add(new Dog1("xiaownag",20));

        //假如我们的使用过程，不小心加入了一只猫
        // arrayList.add(new Cat1("hello" , 15));
        //3.在遍历的时候可以直接取出Dog类型
        for (Dog1 dog1 : arrayList) {
            System.out.println(dog1.getName() + " " +dog1.getAge());
        }
    }
}
class Cat1{
    private String name;
    private int age;

    public Cat1(String name, int age) {
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
class Dog1{
    private String name;
    private int age;

    public Dog1(String name, int age) {
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