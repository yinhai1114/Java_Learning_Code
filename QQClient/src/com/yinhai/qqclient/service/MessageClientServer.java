package com.yinhai.qqclient.service;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 银海
 * @version 1.0
 * 该类提供和消息相关的服务方法
 */
public class MessageClientServer {

    /**
     *
     * @param content 内容文本
     * @param senderId 发送者
     * @param getterId 想要发送的对象
     */
    public void sendMessageToOne(String content,String senderId,String getterId) throws IOException {
        Message message = new Message();
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setMesType(MessageType.MESSAGE_COMM_MES);
        if(message.isOffLineMessage()){
            System.out.print("此为离线消息");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setSendTime(sdf.format(new Date()));//发送时间
        System.out.println(senderId + "对" + getterId + "说 " + content);
        //发送给服务端
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
        objectOutputStream.writeObject(message);
    }
    public void sendMessageToAll(String content,String senderId) throws IOException {
        Message message = new Message();
        message.setSender(senderId);
        message.setGetter("All");
        message.setContent(content);
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setSendTime(sdf.format(new Date()));//发送时间
        System.out.println(senderId + "对大家说 " + content);
        //发送给服务端
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
        objectOutputStream.writeObject(message);
    }
}
