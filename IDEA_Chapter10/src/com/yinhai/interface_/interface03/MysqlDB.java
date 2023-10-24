package com.yinhai.interface_.interface03;

//A程序
public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
