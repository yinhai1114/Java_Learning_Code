package com.yinhai.writer_;

import java.io.*;

/**
 * @author 银海
 * @version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        //Buffered是字符流 所以不要去操作二进制文件[声音，视频，doc，pdf等等]
        String srcFilePath = "e:\\test\\story.txt";
        String destFilePath = "e:\\test\\testBufferedCopy.txt";
        String line;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
            //读取写入 readLine是读取一行的内容，但是没有换行
            while ((line = bufferedReader.readLine()) != null) {
                //每读取一行就写入
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {

                    bufferedReader.close();

                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
