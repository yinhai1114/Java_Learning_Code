package com.yinhai.homework_.homework03;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.post = getClassName(getClass().getName());
    }

    public String getClassName(String className){
    int lastDotIndex = className.lastIndexOf(".");
        if (lastDotIndex != -1) {
        className = className.substring(lastDotIndex + 1);
        }
        return className;
    }
    public void introduce(){
        System.out.println("===========这是老师的信息===========");
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age +
                ", post= "+ post
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
