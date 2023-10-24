package com.yinhai.interface_.interfacedetail02;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
        // IB.n1 = 1; 报错
    }
}
interface IB{void hi(); int n1 = 10;}
interface IC{void say();}
interface ID extends IB,IC{}

class Pig implements IB,IC{

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}