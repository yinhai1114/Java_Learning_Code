package com.yinhai.api;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 韩顺平
 * @version 1.0
 * 演示InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1. 获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-9UOSPK2/192.168.0.105

        //2. 根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("DESKTOP-9UOSPK2");
        System.out.println("host1=" + host1);//DESKTOP-9UOSPK2/192.168.0.105

        //3. 根据域名返回 InetAddress对象, 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);//www.baidu.com / 14.119.104.254

        //4. 通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();//IP 110.242.68.4
        System.out.println("host2 对应的ip = " + hostAddress);//14.119.104.254

        //5. 通过 InetAddress 对象，获取对应的主机名/或者的域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名=" + hostName); // www.baidu.com
    }
}
