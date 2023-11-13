package com.yinhai;

/**
 * @author 银海
 * @version 1.0
 */
public class Cat {

    private String name = "";
    public String age = "1000";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void hi (){
        // System.out.println("========================");
        // System.out.println("meow hi that a reflection");
    }
    public void cry(){
        System.out.println("========================");
        System.out.println("meow cry that a reflection");
    }
}
