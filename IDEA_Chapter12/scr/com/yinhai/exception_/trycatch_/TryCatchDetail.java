package com.yinhai.exception_.trycatch_;

/**
 * @author 银海
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        //ctrl + alt + T
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字" + a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally 代码块被执行");
        }
        System.out.println("程序继续");
    }
}
