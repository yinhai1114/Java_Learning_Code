package com.yinhai.qqserver.server;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 银海
 * @version 1.0
 * 检查用户是否离线和存放离线数据
 */
public class StoreOffline {
    private static HashMap<String,ArrayList<Message>> offLines = new HashMap<>();
    private ArrayList<Message> messagesCom;
    private static ArrayList<Message> messagesAll = new ArrayList<>();


    public void saveMessage(Message message){//该模块负责存放离线数据，如果没有这个对象就直接存，否则直接加在arrlist上
        if(message.getMesType().equals(MessageType.MESSAGE_COMM_MES)){
            if(!offLines.containsKey(message.getGetter())){
                messagesCom = new ArrayList<>();
                messagesCom.add(message);
                offLines.put(message.getGetter(),messagesCom);
            }else {
                offLines.get(message.getGetter()).add(message);
            }

        }
    }
    public HashMap<String,ArrayList<Message>> getOffLines(){
        return offLines;
    }
}
