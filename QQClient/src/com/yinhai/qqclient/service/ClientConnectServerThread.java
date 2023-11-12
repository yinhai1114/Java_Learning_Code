package com.yinhai.qqclient.service;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;
import java.text.SimpleDateFormat;

/**
 * @author 银海
 * @version 1.0
 */
public class ClientConnectServerThread extends Thread {
    //该线程需要持有Socket
    private Socket socket;
    public ClientConnectServerThread(Socket socket){
        this.socket = socket;
    }
    public void run() {
        //因为这个线程需要保持通信，因此我们需要循环
        while(true){
            // System.out.println("客户端线程，等待从服务器端发送的消息");
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message)objectInputStream.readObject();

                if(message.isOffLineMessage()){
                    Thread.sleep(500);
                    System.out.print("这是一条离线留言");
                }
                //判断message类型
                //如果读到的是服务端返回的在线用户列表
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("=================当前在线用户列表====================");
                    for (int i = 0; i <onlineUsers.length; i++) {
                        System.out.println("用户:" + onlineUsers[i]);
                    }

                }//如果读到的是服务端返回的文本消息
                else if(message.getMesType().equals(MessageType.MESSAGE_COMM_MES)){
                    //把从服务器端转发的消息显示到控制台即可
                    String sendTime = message.getSendTime();
                    System.out.println("\n" + sendTime + "\n" + message.getSender() + "对你说 "
                            + message.getContent());
                }else if(message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)){
                    //把从服务器端转发的消息显示到控制台即可
                    String sendTime = message.getSendTime();
                    System.out.println("\n" + sendTime + "\n" + message.getSender() + "对大家说 "
                            + message.getContent());
                }else if(message.getMesType().equals(MessageType.MESSAGE_FILE_MES)){
                    String sendTime = message.getSendTime();
                    System.out.println("\n" + sendTime + "\n" + message.getSender() + "对" + message.getGetter()
                            + "发送文件 "+ message.getSrc() + "到我的电脑目录" + message.getDest());
                    //通过文件输出流写出到磁盘
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest());
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.flush();
                    System.out.println("保存文件成功");
                }
                else{//没有读到，暂时不处理

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //如果服务器没有发送对象，这个线程会阻塞在这里，但是会保留这个socket

        }
    }
    //为了更方便的得到这个socket，需要提供get方法
    public Socket getSocket(){
        return socket;
    }
}
