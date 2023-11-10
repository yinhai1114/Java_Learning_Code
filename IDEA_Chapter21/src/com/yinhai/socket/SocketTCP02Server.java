package com.yinhai.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //该port端口没有其他服务在监听9999
        //1.创建ServerSocket服务端
        //ServerSocket可以对应多个socket //细节:这个ServerSocket 可以通过accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
        //2.获取socket管道
        //如果没有客户端连接9999程序会阻塞，等待连接
        //如果有客户端连接，则会返回socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket =" + socket.getClass());
        //3.回去客户端写入管道的数据
        InputStream inputStream = socket.getInputStream();
        //4.io读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf) )!= -1){
            System.out.println(new String(buf,0,readLen));
        }
        socket.shutdownInput();//设置关闭读取标记
        //5.获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client by server".getBytes());

        //6.关闭流
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
