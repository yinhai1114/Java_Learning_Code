package com.yinhai.array_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 银海
 * @version 1.0
 */

public class ArraysSortCustom {
    public static void main(String[] args) {

        int[] arr = {1, -1, 8, 0, 20};
        // bubble01(arr);
        // System.out.println("==排序后的情况==");
        // System.out.println(Arrays.toString(arr));

        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {//arr[j] arr[j+1]传入这里
                int i1 = (Integer) o1;//拆箱
                int i2 = (Integer) o2;//拆箱
                return i2 - i1;// 判断我们的逻辑是小到大(i1 - i2 > 0)执行排序还是大到小(i2 - i1 > 0)执行排序;
            }
        });

        System.out.println("==定制排序后的情况==");
        System.out.println(Arrays.toString(arr));

    }

    //1.使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组排序由 c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}