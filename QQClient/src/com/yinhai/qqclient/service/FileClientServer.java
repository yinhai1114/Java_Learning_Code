package com.yinhai.qqclient.service;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 银海
 * @version 1.0
 * 该类完成文件传输的服务
 */
public class FileClientServer {
    /**
     *
     * @param src 源文件
     * @param dest 把该文件传输到对方的目录
     * @param senderId 发送用户
     * @param getterId 接收用户
     */
    public void sendFileToOne(String src,String dest,String senderId,String getterId) throws IOException {
        Message message = new Message();
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setSrc(src);
        message.setDest(dest);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        message.setSendTime(sdf.format(new Date()));//发送时间
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        byte[] fileBytes = new byte[(int)new File(src).length()];
        FileInputStream fileInputStream = new FileInputStream(src);
        fileInputStream.read(fileBytes);
        message.setFileBytes(fileBytes);
        if(fileInputStream != null){
            fileInputStream.close();
        }
        System.out.println("\n" + senderId + "给" + getterId + "发送文件:" + src +"到对方的" + dest);
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
        objectOutputStream.writeObject(message);
    }
}
