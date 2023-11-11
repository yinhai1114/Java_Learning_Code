package com.yinhai.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework01Client {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的问题");
            String next = scanner.next();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write(next);
            bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!!
            bufferedWriter.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
            //4.关闭输出流
            socket.shutdownOutput();//设置发送完毕标记 即便是字符流而且没有显式的定义OutputStream也需要关闭

            //5.获取和socket关联的输入流，读取数据(字节)，并显示
            //6.转成Reader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line + "\r\n");
            }
            if(next.equals("exit")){
                socket.close();
                break;
            }
            // com.yinhai.socket.shutdownInput();
            //5. 关闭流对象和socket, 必须关闭
            bufferedReader.close();
        }
        System.out.println("客户端退出...");
    }

}
