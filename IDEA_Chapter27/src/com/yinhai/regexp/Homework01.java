package com.yinhai.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 1.只能有一个@
 * 2. @前面是用户名,可以是a-z A-Z 0-9 _ - 字符
 * 3. @后面是域名，并且域名只能是英文字母，比如sohu.com或者tsinghua.org.cn
 * 4.写出对应的正则表达式，验证输入的字符串是否为满足规则
 */
public class Homework01 {
    public static void main(String[] args) {
        // String content = "643013242@qq.com";
        // String content = "yinhai14@qq.com";
        String content = "yinhai14@qq.com.";
        String regStr = "^[\\w_-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";

        //1. String 的 matches 是整体匹配
        //2. 看看这个matches 底层
        /**
         * String 的 matches
                *  public boolean matches(String regex) {
         *         return Pattern.matches(regex, this);
         *     }
         *
         *  Pattern
                *  public static boolean matches(String regex, CharSequence input) {
         *         Pattern p = Pattern.compile(regex);
         *         Matcher m = p.matcher(input);
         *         return m.matches();
         *     }
         *
         *  Mather类 match
         *  Attempts to match the entire region against the pattern
                *  public boolean matches() {
         *         return match(from, ENDANCHOR);
         *     }
         */
        if(content.matches(regStr)){
            System.out.println("匹配成功");
        }else{
            System.out.println("匹配失败");
        }
    }
}
