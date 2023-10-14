package com.yinhai.extend_;

import com.yinhai.modifier.B;

public class ExtendsTheory {
    public static void main(String[] args) {
        Base base = new Base();
        //要按照查找关系来返回信息
        //1.首先查看子类是否有该属性
        //2.如果子类有该属性而且可以访问，则返回信息
        //3.如果子类没有这个属性，就看父类有没有这个属性（如果有而且可以访问，就返回该信息
        //如果父类没有就重复3依次往上寻找，直到Object
        System.out.println(base.name);
//        System.out.println(base.age);
        System.out.println(base.hobby);
    }
}
class TopBase{//顶层类
    String name = "顶层";
    String hobby = "旅游";
}
class Base extends TopBase{//父类
    String name = "中层";
    private int age = 39;
}
class Default extends Base{//子类
    String name = "底层";
}
