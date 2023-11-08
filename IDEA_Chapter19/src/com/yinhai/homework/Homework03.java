package com.yinhai.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","50");
        properties.setProperty("color","red");
        properties.store(new FileOutputStream("src\\dog.properties"),null);
        Dog dog = new Dog(properties);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("e:\\test\\dog.dat"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();//需要关闭或者刷新才会写入成功
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e:\\test\\dog.dat"));
        Object dogInputStream = objectInputStream.readObject();
        Dog dog1 = (Dog)dogInputStream;
        System.out.println(dog1);
    }
}

