package com.yinhai.homework_;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        int countA = 0;
        int counta = 0;
        int countNum = 0;
        //转成数组判断
        String name = "Yinhai#3612";
        //也可以用str.charAt(i)
        char[] names = name.toCharArray();
        for (int i = 0; i < names.length; i++) {
            if (names[i] <= 'Z' && names[i] >= 'A'){
                countA++;
            }
            if (names[i] <= 'z' && names[i] >= 'a'){
                counta++;
            }
            if (names[i] <= '9' && names[i] >= '0'){
                countNum++;
            }
        }
        System.out.println("该字符串共有" + countA + "个大写字母"
                + counta + "个小写字母" + countNum + "个数字");
    }
}
