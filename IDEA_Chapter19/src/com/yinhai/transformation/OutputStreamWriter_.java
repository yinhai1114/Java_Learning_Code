package com.yinhai.transformation;

import java.io.*;

/**
 * @author 银海
 * @version 1.0
 * 演示 OutputStreamWriter 使用
 * 把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\test\\nihao.txt";
        String charSet = "utf-8";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), charSet));
        bufferedWriter.write("hi, 你好");
        bufferedWriter.close();
        System.out.println("按照 " + charSet + " 保存文件成功~");
    }
}
