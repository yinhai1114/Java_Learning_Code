package com.yinhai.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

/**
 * @author 银海
 * @version 1.0
 */
public class Dog implements Serializable {//注意该类要实现Serializable接口类
    private String name;
    private int age;
    private String color;


    public Dog(Properties properties) throws IOException {
        properties = new Properties();
        properties.load(new FileReader("src\\dog.properties"));

        this.name = properties.getProperty("name");
        this.age =  Integer.parseInt(properties.getProperty("age"));
        this.color = properties.getProperty("color");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
