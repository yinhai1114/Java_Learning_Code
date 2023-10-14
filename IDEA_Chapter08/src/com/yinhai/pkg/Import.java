package com.yinhai.pkg;

import java.util.Arrays;

//注意，在实际开发中，需要哪个类就导入哪个类就好，不建议使用*
//import java.util.Scanner; //表示只会导入java.util 包下的Scanner
//import java.util.*; //表示将包下的所有类导入
public class Import {
    public static void main(String[] args) {
        //使用系统提供的Arrays完成数组排序
        int[] arr = {-1, 5, 6, 7, 9};
        //传统方法对其排序需要自己编写算法
        //而JAVA中已经整合了对应的包 直接调用即可
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
