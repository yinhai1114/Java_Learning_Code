package com.yinhai.qqclient.service;

import java.util.HashMap;

/**
 * @author 银海
 * @version 1.0
 * 该类负责管理客户端连接到服务器端的类
 */
public class ManageClientConnectServerThread {
    //key代表用户ID,value代表线程
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程对应用户加入到集合
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }
    //通过userid获得线程socket
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);
    }
}
