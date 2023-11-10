package com.yinhai.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 * 客户端，发送hello server
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        //解读: 连接本机的 9999端口, 如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());

        //2. 连接上后，生成Socket, 通过socket.getOutputStream()
        //   得到 和 socket对象关联的输出流对象
        //3.将output转成writer 通过输出流，写入数据到 数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello server by client ");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!!
        bufferedWriter.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        //4.关闭输出流
        socket.shutdownOutput();//设置发送完毕标记 即便是字符流而且没有显式的定义OutputStream也需要关闭

        //5.获取和socket关联的输入流，读取数据(字节)，并显示
        //6.转成Reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line + "\r\n");
        }
        // com.yinhai.socket.shutdownInput();
        //5. 关闭流对象和socket, 必须关闭

        bufferedReader.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
