package com.yinhai.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //要求 该port端口没有其他服务在监听9999
        //ServerSocket可以对应多个socket //细节:这个ServerSocket 可以通过accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
        //如果没有客户端连接9999程序会阻塞，等待连接
        //如果有客户端连接，则会返回socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket =" + socket.getClass());
        //io读取
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf) )!= -1){
            System.out.println(new String(buf,0,readLen));
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
