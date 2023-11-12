package com.yinhai.qqserver.server;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 银海
 * @version 1.0
 * 该类的一个对象和某个客户端保持通信
 */
public class ServerConnectClientThread extends Thread {

    private Socket socket;
    private String userId;//连接到服务端的用户id
    private static StoreOffline storeOffline = new StoreOffline();
    private int count = 0;

    public ServerConnectClientThread(String userId, Socket socket) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    public String getUserId() {
        return userId;
    }

    public void run() {//这里线程处于run状态，可以发送/接收消息
        while (true) {
            //如果客户端没有发送对象，这个线程会阻塞在这里，但是会保留这个socket
            System.out.println("服务端和客户端保持通信,对象为" + userId + ",读取数据");
            try {
                Set<String> keySet = storeOffline.getOffLines().keySet();
                System.out.println(keySet + "不在线的而且未发消息的对象");

                if (keySet.contains(userId)) {
                    ArrayList<Message> messages = storeOffline.getOffLines().get(userId);
                    System.out.println(messages.toString());
                    if(count < messages.size()){
                        ObjectOutputStream objectOutputStream =
                                new ObjectOutputStream(ManageServerConnectClientThread.getServerConnectClientThread(userId).socket.getOutputStream());
                        Message message = messages.get(count);
                        count++;
                        message.setOffLineMessage(true);
                        objectOutputStream.writeObject(message);
                        continue;
                    }
                    storeOffline.getOffLines().remove(userId);
                }
                //判断message的类型
                else {

                    count = 0;
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                    Message message = (Message) objectInputStream.readObject();
                    if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {//客户端要在线用户列表
                        System.out.println(message.getSender() + "调取在线用户列表");
                        //从线程管理内获取在线用户列表
                        String onlineUser = ManageServerConnectClientThread.getOnlineUser();
                        //准备返回这个信息
                        //构建一个message对象
                        Message message1 = new Message();
                        message1.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                        message1.setContent(onlineUser);
                        message1.setGetter(message.getSender());
                        //写入到通道返回给客户端
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        objectOutputStream.writeObject(message1);
                    } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {//无异常退出
                        System.out.println(message.getSender() + "要退出系统");
                        //将该客户端对应的线程删除
                        ManageServerConnectClientThread.removeServerConnectClientThread(message.getSender());
                        socket.close();
                        //退出while循环
                        break;
                    } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {//私聊
                        ServerConnectClientThread serverConnectClientThread
                                = ManageServerConnectClientThread.getServerConnectClientThread(message.getGetter());
                        if (ManageServerConnectClientThread.checkOffline(message.getGetter())) {//如果私聊的用户不在线，存到hashmap内
                            storeOffline.saveMessage(message);
                        } else {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.socket.getOutputStream());
                            objectOutputStream.writeObject(message);//转发，如果用户不在线可以考虑存到数据库，做成离线留言
                        }
                    } else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
                        storeOffline.saveMessage(message);
                        //需要遍历得到所有线程socket,先获得所有的线程的集合
                        HashMap<String, ServerConnectClientThread> hashMap = ManageServerConnectClientThread.getHashMap();
                        Set<String> userIds = hashMap.keySet();
                        for (String userId : userIds) {
                            if (userId.equals(message.getSender())) {
                                continue;
                            }
                            ServerConnectClientThread serverConnectClientThread = hashMap.get(userId);
                            OutputStream outputStream = serverConnectClientThread.socket.getOutputStream();
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                            objectOutputStream.writeObject(message);
                        }

                    } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {
                        OutputStream outputStream = ManageServerConnectClientThread.getServerConnectClientThread(message.getGetter()).socket.getOutputStream();
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(message);
                    } else {

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();

            }
        }
    }
}
