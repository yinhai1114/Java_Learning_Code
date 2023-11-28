package com.yinhai.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(a.bc(123( )";
        //匹配( => \\(  String regStr = "\\(";
        //匹配. => \\.  String regStr = "\\.";

        //String regStr = "\\d\\d\\d";
        String regStr = "\\d{3}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
