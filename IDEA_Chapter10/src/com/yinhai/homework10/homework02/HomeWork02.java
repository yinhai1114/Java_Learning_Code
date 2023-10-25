package com.yinhai.homework10_.homework02;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());


    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        getNextNum();
        serialNumber = currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}