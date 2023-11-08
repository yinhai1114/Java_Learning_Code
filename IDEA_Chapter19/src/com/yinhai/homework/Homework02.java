package com.yinhai.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 银海
 * @version 1.0
 * 要求:使用BufferedReader读取一 个文本文件， 为每行加上行号，
 * 再连同内容一并输出到屏幕上。
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String path = "e:\\test\\testBufferedCopy.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int i = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(++i + line);
        }
        if(bufferedReader != null){
            bufferedReader.close();
        }
    }
}
