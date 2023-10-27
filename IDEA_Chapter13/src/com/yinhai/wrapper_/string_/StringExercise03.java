package com.yinhai.string_;

/**
 * @author 银海
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";//指向常量池的hsp
        String b = new String("hsp");//b指向堆，String内的，对象内的value指向常量池
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//F a->常量池"hsp" b->堆里的String空间的value
        System.out.println(a == b.intern());//T
        System.out.println(b == b.intern());//F
        //intern:返回当调用intern方法时，如果池已经包含一个等于此，String对象的字符串(用equals(Obiect方法确定)
        //则返回池中的字符串。否则，将此String对象添加到池中，并返回此String对象的引用
        //b.intern()方法最终返回的是常量池的地址(对象)
    }
}
