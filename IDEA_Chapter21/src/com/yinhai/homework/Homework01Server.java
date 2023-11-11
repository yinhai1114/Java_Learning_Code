package com.yinhai.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        //该port端口没有其他服务在监听9999
        //1.创建ServerSocket服务端
        //ServerSocket可以对应多个socket //细节:这个ServerSocket 可以通过accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
        //2.获取socket管道
        //如果没有客户端连接9999程序会阻塞，等待连接
        //如果有客户端连接，则会返回socket对象，程序继续


        //3.转成字符流 获取客户端写入管道的数据

        //4.io读取
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            String answer = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("name")) {
                    answer = "My name is yinhai";
                } else if ("hobby".equals(line)) {
                    answer = "My favor to compile program";
                }else if ("exit".equals(line)){
                    answer = "exit";
                }
                else {
                    answer = "Sorry , about that cant understand with me";
                }
            }
            socket.shutdownInput();

            //5.获取socket相关联的输出流 并转成字符流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //6.写入数据
            bufferedWriter.write(answer);
            bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!!
            bufferedWriter.flush();
            socket.shutdownOutput();//设置发送完毕标记
            if (answer.equals("exit")){
                socket.close();
                break;
            }
        }

        //6.关闭流

        serverSocket.close();
    }
}
