package com.yinhai.exception_.homework12;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework03 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {//main方法
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }


}
