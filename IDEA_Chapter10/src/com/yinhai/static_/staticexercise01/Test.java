package com.yinhai.static_.staticexercise01;

public class Test {
    static int count = 9;

    public void count() {
        System.out.println(" count=" + (count++));
    }

    public static void main(String args[]) {
        new Test().count();
        new Test().count();
        System.out.println(Test.count);
    }
}

