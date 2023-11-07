package com.yinhai.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;


/**
 * @author 银海
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //1 new File (String pathname)
    @Test
    public void create01(){
        String filePath = "e:\\new1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //new File(File parent,String child) //根据父目录文件+子路径构建
    @Test
    public void create02(){
        File parentFile = new File("e:\\");
        String fileName = "new2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create03(){
        String parentPath = "e:\\";
        String filePath = "news3.txt";
        File file = new File (parentPath,filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
