package com.yinhai.qqserver.server;

import com.yinhai.qqcommon.Message;
import com.yinhai.qqcommon.MessageType;
import com.yinhai.utils.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 银海
 * @version 1.0
 */
public class SendNewsToAllService implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入服务器要推送的新闻 输入exit退出推送服务");
            String news = Utility.readString(100);
            if(news.equals("exit")){
                break;
            }
            Message message = new Message();
            message.setSender("服务器");
            message.setContent(news);
            message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
            message.setSendTime(sdf.format(new Date()));//发送时间
            System.out.println("服务器推送消息" + news);
            //遍历集合
            Set<String> keySet = ManageServerConnectClientThread.getHashMap().keySet();
            for (String key : keySet) {
                ServerConnectClientThread serverConnectClientThread = ManageServerConnectClientThread.getServerConnectClientThread(key);
                try {
                    OutputStream outputStream = serverConnectClientThread.getSocket().getOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
