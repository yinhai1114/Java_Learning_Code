package com.yinhai.qqserver.server;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;
import com.yinhai.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * @author 银海
 * @version 1.0
 * 这是服务器，在监听9999，等待客户端连接并通信
 */
public class QQServer {
    private ServerSocket serverSocket = null;
    private static HashMap<String,User> validUsers = new HashMap<>();
    private SendNewsToAllService sendNewsToAllService = new SendNewsToAllService();
    //可以使用ConcurrentHashMap 可以处理并发集合
    //hashmap没有线程安全

    static {//静态代码块，初始化合法用户的列表
        validUsers.put("100",new User("100","123456"));
        validUsers.put("200",new User("100","123456"));
        validUsers.put("300",new User("100","123456"));
        validUsers.put("小王",new User("小王","123456"));
        validUsers.put("小黄",new User("小黄","123456"));
        validUsers.put("小明",new User("小明","123456"));
    }
    //验证用户是否有效的方法
    private boolean checkUser(String userId,String pwd){
        User user = validUsers.get(userId);
        if(user == null){
            System.out.println("该用户不存在");
            return false;
        }
        if(!user.getPassword().equals(pwd)){//userId正确但是密码错误
            System.out.println("密码错误");
            return false;
        }
        if (ManageServerConnectClientThread.getServerConnectClientThread(userId) != null ) {
            System.out.println("已经有其他用户登录");
            return false;
        }
        return true;
    }
    public QQServer(){
        System.out.println("服务端在9999端口监听");
        new Thread(sendNewsToAllService).start();
        System.out.println("启动推送服务");
        try {
            serverSocket = new ServerSocket(9999);

            while (true) {//当和某个客户端连接后，会继续监听，因此while
               Socket socket = serverSocket.accept();
               //得到关联的对象输入流
                ObjectInputStream objectInputStream
                        = new ObjectInputStream(socket.getInputStream());
                User user = (User)objectInputStream.readObject();
                //得到关联对象的输出流
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

                Message message = new Message();

                //验证用户
                if(checkUser(user.getUserId(), user.getPassword())){
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    objectOutputStream.writeObject(message);
                    //创建一个线程 和客户端保持通讯，该线程也需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(user.getUserId(), socket);
                    serverConnectClientThread.start();
                    //编写一个类 用于存放该线程对象
                    ManageServerConnectClientThread.addServerConnectClientThread(user.getUserId(), serverConnectClientThread);

                }else{//登录失败
                    System.out.println(user.getUserId() + "登录失败密码为" + user.getPassword() );
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    objectOutputStream.writeObject(message);
                    //如果登录失败需要关闭
                    socket.close();
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //如果服务端退出了while 说明服务端不再监听，因此需要关闭ServerSocket
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
