package com.yinhai.qqcommon;

import java.io.Serializable;

/**
 * @author 银海
 * @version 1.0
 * 表示客户端和服务端通信时的消息对象
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;//用于记录序列化ID
    private String sender;
    private String getter;
    private String content;//消息内容
    private String sendTime;//发送时间
    private String mesType;//消息类型[可以在接口中定义消息类型]
    private boolean offLineMessage = false;

    public boolean isOffLineMessage() {
        return offLineMessage;
    }

    public void setOffLineMessage(boolean offLineMessage) {
        this.offLineMessage = offLineMessage;
    }

    //进行拓展 跟文件相关的成员
    private byte[] fileBytes;
    private int filelen = 0;
    private String dest;
    private String src;

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public int getFilelen() {
        return filelen;
    }

    public void setFilelen(int filelen) {
        this.filelen = filelen;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }
}

