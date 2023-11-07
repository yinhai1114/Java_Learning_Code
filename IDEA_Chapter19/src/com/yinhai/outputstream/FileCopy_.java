package com.yinhai.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 银海
 * @version 1.0
 */
public class FileCopy_ {
    public static void main(String[] args) {
        String filePath = "e:\\test\\miku.jpg";
        String destFilePath = "e:\\\\mikucopy.jpg";
        //将该文件复制到e:\\miku.jpg
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream =null;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组提高读取效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1){
                //读取到后就写入文件

                fileOutputStream.write(buf,0,readLen);//readLen接受到的是当前读取的长度
                //fileOutputStream.write(buf);//不能使用该方法，会导致及使不够也会抓到1024的长度的内容
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭输入流和输出流
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
