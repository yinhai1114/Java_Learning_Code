package com.yinhai.qqclient.service;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;
import com.yinhai.qqcommon.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 银海
 * @version 1.0
 * 完成用户登录验证，和用户注册等功能
 */
public class UserClientService {
    private boolean loop ;
    private User u = new User();
    //因为我们只是检测，如果频繁的new
    //会造成空间的浪费
    //socket在其他地方也可能使用，因此做成属性
    private Socket socket;

    //根据userId和pwd到服务器验证该用户是否合法
    public boolean checkUser(String userId,String pwd) throws IOException, ClassNotFoundException {
        u.setUserId(userId);
        u.setPassword(pwd);
        //连接到服务端，发送u对象
        socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(u);
        // socket.shutdownOutput();//应该是需要关闭的，再看看老师怎么编程 注 不需要更改，因为object流对象有明确的边界

        //读取从服务器回复的Message对象
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Message message = (Message)objectInputStream.readObject();
        if(message.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){
            //登录成功
            //需要启动线程维护socket，创建一个服务器端保持通信--创建一个类，ClientConnectServerThread
            ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
            clientConnectServerThread.start();
            //为了方便管理，将该线程放到一个集合内——ManageClientConnectServerThread
            ManageClientConnectServerThread.addClientConnectServerThread(userId,clientConnectServerThread);
            loop = true;//登录成功,设置为true
        }else{
            //登录失败，如果我们登录失败，我们需要关闭该socket释放资源
            socket.close();

        }
        return loop;
    }
    //向服务器端请求在线用户列表
    public void onlineFriendList() throws IOException {
        //发送一个Message 类型为GET_ONLINE_FRIEN
        Message message = new Message();
        message.setSender(u.getUserId());
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        //发送给服务器
        //应该获得当前线程Socket对应的ObjectOut对象
        ClientConnectServerThread clientConnectServerThread//从管理内拿出线程
                = ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
        Socket socket = clientConnectServerThread.getSocket();//再获取线程的socket
        OutputStream outputStream = socket.getOutputStream();//得到管道的输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);//传入到对象流
        objectOutputStream.writeObject(message);
    }

    public void logout() throws IOException {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());
        //发送对象
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ClientConnectServerThread clientConnectServerThread
                = ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
        OutputStream outputStream = clientConnectServerThread.getSocket().getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(message);
        System.out.println(u.getUserId() + "退出了线程");
        System.exit(0);
    }

}
