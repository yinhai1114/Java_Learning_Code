package com.yinhai.homework;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downloadFileName = "";
        while ((len = inputStream.read(b))!= -1){
            downloadFileName += new String(b,0,len);
        }
        System.out.println(downloadFileName);
        //服务器上有两个文件 无名.mp3 高山流水.mp3
        //如果下载的是高山流水返回该文件，否则一律返回无名
        String resFileName = "";
        if("高山流水".equals(downloadFileName)){
            resFileName = "src\\高山流水.mp3";
        }else{
            resFileName = "src\\无名.mp3";
        }
        //创建输入流读取文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFileName));
        //使用工具类
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //得到socket相关的输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        //关闭相关的资源
        inputStream.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("关闭服务端");
    }
}
