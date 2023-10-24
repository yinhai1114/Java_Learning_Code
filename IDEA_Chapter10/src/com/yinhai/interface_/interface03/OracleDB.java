package com.yinhai.interface_.interface03;

//B程序员连接Oracle
public class OracleDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("连接oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle");
    }
}
