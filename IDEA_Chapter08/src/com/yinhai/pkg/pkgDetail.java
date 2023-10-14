//package是声明当前类所在的包，需要放在最上面
// 一个类最多只有一句package

package com.yinhai.pkg;

//import是放在package下面，在类定义之前，没有顺序要求

import java.util.Arrays;
import java.util.Scanner;

public class pkgDetail {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner();
        int[] arr = {-1, 5, 3};
        Arrays.sort(arr);
    }
}
