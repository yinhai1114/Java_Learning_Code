package com.yinhai.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 演示正则表达式的案例
 *
 */
public class RegExp11 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV1fh411y7R8?p=893&spm_id_from=pageDriver&vd_source=6af85ae96c487fe7bd51b3d5644ebafc";
        /*
           1.先确定url开始的部分https:// | http://
           2.然后匹配www.bilibili.com  ->  ([\w-]+\.)+[\w-]+
           3.然后匹配/video/BV1fh411y7R8?p=893&spm_id_from=page... -> (\/[\w-?=&/%.#]*)?
         */
        //中括号内的?.都是表示字符的?.并不带有其他含义
        String regStr = "^((https|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        if(matcher.find()){
            System.out.println("格式正确");
        }else{
            System.out.println("格式错误");
        }

        //这里如果使用Pattern的matches 整体匹配 比较简洁 //当使用matches方法可以不用在regStr里带上定位符号
        System.out.println(Pattern.matches(regStr, content));//
    }
}
