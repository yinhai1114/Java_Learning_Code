package com.yinhai.codeblock_;

class Person {
    public static int total;//0

    static {//静态成员只在类加载的时候执行一次
        total = 100;//赋值100
        System.out.println("in static block!");//1 in static block!
    }
}

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total);//Person的时候就执行类加载 //2 total = 100
        System.out.println("total = " + Person.total);//3 total = 100
    }
}

