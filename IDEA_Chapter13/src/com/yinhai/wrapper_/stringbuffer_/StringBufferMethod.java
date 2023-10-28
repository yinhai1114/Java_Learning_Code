package com.yinhai.stringbuffer_;

/**
 * @author 银海
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("hello");
        //添加方法
        s.append(',');// "hello,"
        s.append("张三丰");//"hello,张三丰"
        s.append("赵敏").append(100).append(true).append(10.5);//"hello,张三丰赵敏100true10.5"
        System.out.println(s);//"hello,张三丰赵敏100true10.5"


        //删除方法
        /*
         * 删除索引为>=start && <end 处的字符
         * 解读: 删除 11~14的字符 [11, 14) 到14-1下标的索引都同理
         */
        s.delete(11, 14);
        System.out.println(s);//"hello,张三丰赵敏true10.5"
        //修改方法
        //使用 周芷若 替换 索引9-11的字符 [9,11)
        s.replace(9, 11, "周芷若");
        System.out.println(s);//"hello,张三丰周芷若true10.5"
        //查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);//6
        //插入方法
        //在索引为9的位置插入 "赵敏",原来索引为9的内容自动后移
        s.insert(9, "赵敏");//包含9
        System.out.println(s);//"hello,张三丰赵敏周芷若true10.5"
        //长度
        System.out.println(s.length());//22
        System.out.println(s);

    }
}
