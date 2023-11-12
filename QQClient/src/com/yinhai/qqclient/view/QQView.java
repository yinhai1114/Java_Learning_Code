package com.yinhai.qqclient.view;

import com.yinhai.qqclient.service.FileClientServer;
import com.yinhai.qqclient.service.MessageClientServer;
import com.yinhai.qqclient.service.UserClientService;
import com.yinhai.qqclient.utils.Utility;

import java.io.IOException;


/**
 * @author 银海
 * @version 1.0
 */
public class QQView {
    private boolean loop = true ;//控制是否显示菜单
    private String key = "";//检测用户的输入
    //用于登录//验证
    private UserClientService userClientService = new UserClientService();//我们需要使用该服务，所以创建一个对象
    private MessageClientServer messageClientServer = new MessageClientServer();
    private FileClientServer fileClientServer = new FileClientServer();
    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出");
    }

    //显示主菜单

    private void mainMenu(){
        while (loop){
            System.out.println("============欢迎登录网络通信系统============");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.print("请输入你的选择");
            key = Utility.readString(1);
            switch (key){
                case "1":
                    System.out.print("请输入用户号：");
                    String userId = Utility.readString(50);
                    System.out.print("请输入密 码：");
                    String pwd = Utility.readString(50);
                    //需要到服务端去验证用户是否存在
                    //建一个包用于存放服务类
                    try {
                        if(userClientService.checkUser(userId,pwd)){
                            System.out.println("============欢迎( " + userId+ "登录成功)============");
                            //进入到二级菜单
                            while(loop){
                                System.out.println("============网络通信二级菜单============");
                                System.out.println("\t\t 1 显示在线用户列表");
                                System.out.println("\t\t 2 群发消息");
                                System.out.println("\t\t 3 私聊消息");
                                System.out.println("\t\t 4 发送文件");
                                System.out.println("\t\t 9 退出系统");
                                System.out.println("请输入你的选择");
                                key = Utility.readString(1);
                                switch (key){
                                    case "1"://显示在线用户
                                        //需要调用某个服务发送给服务端
                                        //写在userClientServer内
                                        userClientService.onlineFriendList();
                                        break;
                                    case "2"://群发
                                        System.out.println("请输入相对大家说的话");
                                        String contentAll = Utility.readString(100);
                                        messageClientServer.sendMessageToAll(contentAll,userId);
                                        break;
                                    case "3":
                                        System.out.println("请输入想聊天的用户号(在线)");
                                        String getterId = Utility.readString(50);
                                        System.out.println("输入的内容");
                                        String content = Utility.readString(100);
                                        //编写一个方法，将消息发送给服务端
                                        messageClientServer.sendMessageToOne(content,userId,getterId);
                                        System.out.println("私聊消息");
                                        break;
                                    case "4":
                                        System.out.print("请输入你想把文件发送给的用户()");
                                        String getterId1 = Utility.readString(50);
                                        System.out.print("请输入发送文件的路径 d:\\xx.jpg");
                                        String src = Utility.readString(100);
                                        System.out.print("请输入到发送到对方的路径");
                                        String dest = Utility.readString(100);
                                        fileClientServer.sendFileToOne(src,dest,userId,getterId1);
                                        break;
                                    case "9":
                                        //需要有一个方法给服务器端发送一个退出系统的Message对象
                                        userClientService.logout();
                                        loop = false;
                                        break;

                                }
                            }
                        }else{
                            System.out.println("============登录失败============");
                        }

                    }
                    catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }
        }
    }
}
