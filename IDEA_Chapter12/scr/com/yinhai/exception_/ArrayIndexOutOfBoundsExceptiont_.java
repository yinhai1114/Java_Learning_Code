package com.yinhai.exception_;

/**
 * @author 银海
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsExceptiont_ {
    public static void main(String[] args) {
        int[] arr = {1,2};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
