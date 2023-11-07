package com.yinhai.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 银海
 * @version 1.0
 * 单个字节的读取
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01() {
        String filePath = "e:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readDate = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如何返回-1，表示读取完毕
            while ((readDate = fileInputStream.read()) != -1) {
                System.out.print((char) readDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
@Test
    public void readFile02() {
        String filePath = "e:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readDate = 0;
        byte[] buf = new byte[8];
        int readLen = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如何返回-1，表示读取完毕
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
