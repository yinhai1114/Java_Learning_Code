package com.yinhai.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 银海
 * @version 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){

        File file = new File("e\\new1.txt");
        System.out.println(file.getName());
        //调用相应的方法，得到对应信息
        //获取文件名字getName
        System.out.println("文件名字=" + file.getName());
        //文件绝对路径getAbsolutePath
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        //文件父级目录getParent
        System.out.println("文件父级目录=" + file.getParent());
        //文件大小(字节)length
        System.out.println("文件大小(字节)=" + file.length());
        //文件是否存在exists
        System.out.println("文件是否存在=" + file.exists());//T
        //是不是一个文件isFile
        System.out.println("是不是一个文件=" + file.isFile());//T
        //是不是一个目录isDirectory
        System.out.println("是不是一个目录=" + file.isDirectory());//F


    }
}
