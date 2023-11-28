package com.yinhai.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 正则表达式的引用实例
 */
public class RegExp10 {
    public static void main(String[] args) {
        //汉字
        //String content = "韩顺平教育";
        // String regStr = "^[\u0391-\uffe5]+$";

        //邮政编码
        //要求:是1-9开头的一个六位数.比如: 123890
        // String content = "111140";
        //要求是1-9开头的六位数 比如123890
        // String regStr = "^[1-9]\\d{5}$";

        //QQ号码
        //要求:是1-9开头的一个(5位数10位数)比如: 12389 , 1345687，187698765
        // String content = "111140";
        // String regStr = "^[1-9]\\d{4,9}$";

        //手机号码
        //要求必须以13,14,15,18开头的11位数，比如13588889999
        String content = "13588889999";
        String regStr = "^1[3|4|5|8]\\d{9}$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()){
            System.out.println("满足格式");
        }else{
            System.out.println("不满足格式");
        }
    }
}
