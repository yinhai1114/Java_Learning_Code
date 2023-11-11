package com.yinhai.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 银海
 * @version 1.0
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket对象 准备在9999端口接收
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2.构建数据包，准备接收数据,一个数据包最大为64k
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        //3.调用接收方法，通过网络传输的packet对象填充到packet对象内
        datagramSocket.receive(datagramPacket);//如果没有数据包发送过来，就会阻塞等待
        //4.把packet拆包并显示
        int length = datagramPacket.getLength();//实际接收到的长度
        byte[] data = datagramPacket.getData();//接受数据
        String s = new String(data, 0, length);
        System.out.println(s);
        //接受到后发送ok回去
        byte[] bytes = "OK,I get it and hello UDPSender".getBytes();

        DatagramPacket datagramPacket1 =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.0.105"),9998);
        datagramSocket.send(datagramPacket1);
        //5.关闭资源
        datagramSocket.close();
    }
}
