package com.yinhai.homework_;

import javax.lang.model.element.NestingKind;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Yin xiao Hai";
        printName(name);
    }
    public static void printName(String name){
        if(name == null){
            System.out.println("不能为空");
            return;
        }
        //对接受的字符串分割
        String[] str = name.split(" ");
        if (str.length != 3){
            System.out.println("输入的字符串格式不对");
            return;
        }
        System.out.println(String.format("%s,%s .%c" ,str[2],str[0],str[1].toUpperCase().charAt(0)));
    }
}
