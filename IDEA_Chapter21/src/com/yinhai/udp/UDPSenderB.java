package com.yinhai.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 银海
 * @version 1.0
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象，准备发送和数据，该对象 可以接受和发送
        DatagramSocket datagramSocket = new DatagramSocket(9998);//准备在9998等别人的发送数据
        //2.将需要发送的数据封装到packet对象中
        byte[] bytes = "hello UDPReceiver".getBytes();
        //说明:封装的DatagramPacket对象(内容字节数组，data.Length ,主机(IP) ,端口)
        DatagramPacket datagramPacket =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.0.105"), 9999);
        datagramSocket.send(datagramPacket);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(buf, buf.length);
        //3.调用接收方法，通过网络传输的packet对象填充到packet对象内
        datagramSocket.receive(datagramPacket1);//如果没有数据包发送过来，就会阻塞等待
        //4.把packet拆包并显示
        int length = datagramPacket1.getLength();//实际接收到的长度
        byte[] data = datagramPacket1.getData();//接受数据
        String s = new String(data, 0, length);
        System.out.println(s);
        datagramSocket.close();
    }
}
