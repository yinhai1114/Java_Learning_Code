package com.yinhai.socket.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 */
public class SocketTCP04Client {//客户端读取文件
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "src\\com\\yinhai\\socket\\upload\\miku.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

        //bytes这个就是文件对应的字节数
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //通过socket获取输出流 写出到管道
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        bufferedOutputStream.write(bytes);
        socket.shutdownOutput();//记得写入标记

        //接收管道内的传输成功数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(bufferedReader.readLine());
        socket.shutdownInput();//记得写入标记


        //关闭暂时不需要的流
        outputStream.close();
        bufferedInputStream.close();
        socket.close();
        bufferedReader.close();

    }
}
