package com.yinhai.homework_.homework13;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play(){
        return name;
    }

    @Override
    public String toString() {//需要有一个打印信息的方法
        return "姓名：" + name + "\n" + "年龄:" + age + "\n" + "性别:" + sex + "\n" ;
    }
    public void printInfo(){
        System.out.println(toString());
    }

}
