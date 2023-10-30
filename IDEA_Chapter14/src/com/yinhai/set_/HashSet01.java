package com.yinhai.set_;

import java.util.HashSet;

/**
 * @author 银海
 * @version 1.0
 */

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //说明
        //1. 在执行add方法后，会返回一个boolean值
        /*
        public boolean add(E e) {
              return map.put(e, PRESENT)==null;
        }
         */
        //2. 如果添加成功，返回 true, 否则返回false
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T

        //3. 可以通过 remove 指定删除哪个对象
        set.remove("john");
        System.out.println("set=" + set);//3个

        //
        set  = new HashSet();
        System.out.println("set=" + set);//0
        //4 Hashset 不能添加相同的元素/数据
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了 指向常量池的同一个，所以地址相同
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//Ok 不同的元素，地址不同所以是不同的对象
        System.out.println("set=" + set);

        //在加深一下. 非常经典的面试题.
        //看源码，做分析， 先给小伙伴留一个坑，以后讲完源码，你就了然
        //去看他的源码，即 add 到底发生了什么?=> 底层机制.
        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//加不了
        System.out.println("set=" + set);


    }
}
class Dog { //定义了Dog类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}