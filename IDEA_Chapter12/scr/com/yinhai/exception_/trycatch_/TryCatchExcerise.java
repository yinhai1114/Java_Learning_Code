package com.yinhai.exception_.trycatch_;

import java.util.Scanner;

/**
 * @author 银海
 * @version 1.0
 */
public class TryCatchExcerise {
    public static void main(String[] args) {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("请输入一个整数");
                name = scanner.next();
                System.out.println("输入的信息为" + name);
                int num = Integer.parseInt(name);
                System.out.println("成功获取整数=" + num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("错误信息为" + e.getMessage() + "请重试");
                continue;
            }
        }
    }
}
