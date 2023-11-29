package com.yinhai.regexp;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 要求验证是不是整数或者小数
 * 提示:这个题要考虑正数和负数
 * 比如:123 -345 34.89 -87.9 -0.01 0.45等
 */
public class Homework02 {
    public static void main(String[] args) {
        String content = "-0.01";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

        if (content.matches(regStr)) {
            System.out.println("匹配成功 是整数或者小数");
        }else{
            System.out.println("匹配失败");
        }
    }
}
