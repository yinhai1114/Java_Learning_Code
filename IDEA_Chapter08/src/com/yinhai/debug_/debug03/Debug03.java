package com.yinhai.debug_.debug03;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {-1 ,20,10,0};
        //want to watch how a method is implemented,can use Debug
        Arrays.sort(arr);//use F7 cant jump into jdk original code,so,how to jump into the jdk original code?
        //can use force step into Alt + shift + F7
        //and refer to above other one solution method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
