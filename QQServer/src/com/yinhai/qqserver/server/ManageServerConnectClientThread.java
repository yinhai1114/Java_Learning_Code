package com.yinhai.qqserver.server;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 银海
 * @version 1.0
 * 该类用于管理和客户端通信的线程
 */
public class ManageServerConnectClientThread {
    private static HashMap<String,ServerConnectClientThread> hashMap = new HashMap<>();

    //添加线程对象到hashMap集合
    public static void addServerConnectClientThread(String userId,ServerConnectClientThread serverConnectClientThread){
       hashMap.put(userId,serverConnectClientThread);
    }
    public static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hashMap.get(userId);
    }
    public static String getOnlineUser(){
        Set<String> strings = hashMap.keySet();//先取出set 再用迭代器
        String onlineUserlist = "";
        for (String s :strings) {
            onlineUserlist += s + " ";
        }
        return onlineUserlist;
    }
    public static boolean checkOffline(String userId){
        String onlineUser = getOnlineUser();
        if(!onlineUser.contains(userId)){
            return true;
        }
        return false;
    }
    public static void removeServerConnectClientThread(String userId){
        hashMap.remove(userId);
    }

    public static HashMap<String, ServerConnectClientThread> getHashMap() {
        return hashMap;
    }
}
