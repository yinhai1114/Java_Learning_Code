package com.yinhai.wrapper_;

/**
 * @author 银海
 * @version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //Integer -> String
        //方法1
        Integer i = 1100;
        String str1 = i + "";
        //方法2
        String str2 = i.toString();
        String str3 = String.valueOf(i);//进入也是调用toString
        //String -> 包装类(Integer)
        //方法1
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//parseInt返回int然后自动装箱
        //方法2
        Integer integer = new Integer(str4);//构造器可以接一个String

    }
}
