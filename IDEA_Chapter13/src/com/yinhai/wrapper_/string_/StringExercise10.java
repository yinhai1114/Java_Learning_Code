package com.yinhai.string_;

import java.util.Arrays;

/**
 * @author 银海
 * @version 1.0
 */
public class StringExercise10 {
}

class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};//final指的是ch指向的地址不能改变

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }



    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}