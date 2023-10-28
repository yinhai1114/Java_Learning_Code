package com.yinhai.string_;

/**
 * @author 银海
 * @version 1.0
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        //1.创建了一个StringBuilder
        //2.执行sb.append("hello") 3.再append("abc")
        //再调用String sb.toString()
        //最后其实是c->堆中的对象的value[] ->池中的"helloabc"
        String c = a + b;
        //如果有了就直接用
        String d = "hello" + "abc";//直接指向堆里的helloabc
        System.out.println(c == d);//false
    }
}
