package com.yinhai.homework;

import java.io.*;

/**
 * @author 银海
 * @version 1.0
 *
 *
 *
 *
 * 3)如果hello.txt已经存在，提示该文件已经存在，就不要再重复创建了
 *
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        //1)在判断e盘下是否有文件夹mytemp，如果没有就创建mytemp
        String path = "e:\\test\\mytemp";
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }else{
            System.out.println("已存在");
        }
        //2)在e:\\mytemp目录下，创建文件hello.txt
        FileWriter fileWriter =null;
        try {
            fileWriter = new FileWriter(path + "\\test.txt",true);
            fileWriter.write("hello,world\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
        }
        //3)如果hello.txt已经存在，提示该文件已经存在，就不要再重复创建了
        File file1 = new File(path,"\\hello.txt");
        FileWriter fileWriter1 =null;

        try {
            if(!file1.exists()) {
                fileWriter1 = new FileWriter(file1);
                fileWriter1.write("hello,world\n");
            }else{
                System.out.println("已存在");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter1 != null) {
                fileWriter1.close();
            }
        }
    }
}
