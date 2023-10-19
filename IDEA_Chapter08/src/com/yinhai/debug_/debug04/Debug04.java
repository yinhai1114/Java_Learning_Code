package com.yinhai.debug_.debug04;

import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
            int[] arr = {-1 ,20,10,0};
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("hello 0");
            System.out.println("hello 50");
            System.out.println("hello 100");
            System.out.println("hello 200");
            System.out.println("hello 300");
            System.out.println("hello 400");
    }
}
