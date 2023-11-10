package com.yinhai.socket.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 银海
 * @version 1.0
 */
public class SocketTCP04Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        //该方法已经读到了数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //将得到的byte数组写入到指定的路径
        String receptionPath = "src\\com\\yinhai\\socket\\upload\\serverReceptionFile\\mikuByServer.jpg";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(receptionPath));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("Server已收到客户端传来的文件,文件创建在" + receptionPath);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();


        //关闭流
        bufferedOutputStream.close();
        socket.close();
        bufferedInputStream.close();
        bufferedWriter.close();

    }
}
