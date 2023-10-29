package com.yinhai.homework_;

import java.util.Scanner;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Person person = new Person();
        while (!person.enterInfo()) {}
    }
}

class Person {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String password;
    private String mail;

    public Person() {
    }

    public boolean enterInfo() {
        try {
            System.out.println("请输入名字长度为2 3 4");
            judeName(scanner.next());
            System.out.println("请输入六位密码");
            judePassword(scanner.next());
            System.out.println("请输入邮箱，带有@以及.且@在.之前");
            judeMail(scanner.next());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("请重新尝试");
            return false;
        }
        System.out.println("注册成功");
        return true;
    }

    public void judeName(String name) {
        if (2 <= name.length() && name.length() <= 4) {
            this.name = name;
        } else {
            throw new RuntimeException("名字长度错误");
        }
    }

    public void judePassword(String password) {
        char[] chars = password.toCharArray();
            if (chars.length != 6) {
                throw new RuntimeException("密码长度错误");
            }
            for (int i = 0; i < chars.length; i++) {
                if (!(chars[i] < 58 && chars[i] > 47)){
                    throw new RuntimeException("密码包含非数字元素");
                }
            }
        this.password = String.valueOf(chars);
    }

    public void judeMail(String mail) {
        int index1 = mail.lastIndexOf('@');
        int index2 = mail.lastIndexOf('.');
        if (index1 > index2) {
            throw new RuntimeException("格式错误 @必须在.之前");
        }
        if(index1 == -1){
            throw new RuntimeException("格式错误 必须含有@");
        }
        if(index2 == -1){
            throw new RuntimeException("格式错误 必须含有.");
        }

        this.mail = mail;
    }
}
