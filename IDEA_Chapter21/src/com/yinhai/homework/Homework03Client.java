package com.yinhai.homework;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //接受用户输入 准备从服务端下载
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要下载的名字");
        String downloadFileName = scanner.next();
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(downloadFileName.getBytes());
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes1 = StreamUtils.streamToByteArray(bufferedInputStream);

        String fileName = "";
        if(downloadFileName.equals("高山流水")){
            fileName = "高山流水";
        }else {
            fileName ="无名";
        }
        String filePath = "src\\com\\yinhai\\homework\\downloadFile\\" + fileName + ".mp3" ;
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(filePath));
        bufferedOutputStream1.write(bytes1);
        bufferedOutputStream1.flush();

        bufferedInputStream.close();
        bufferedOutputStream.close();
        bufferedOutputStream1.close();
        socket.close();
    }
}
