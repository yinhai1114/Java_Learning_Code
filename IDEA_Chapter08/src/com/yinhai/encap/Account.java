package com.yinhai.encap;

public class Account {
    public String name;//长度为2 3 4位
    private int account;//>20
    private String password;//必须是6位

    public Account(String name, int account, String password) {
        setName(name);
        setAccount(account);
        setPassword(password);
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 5){
            this.name = name;
        }
        else{
            System.out.println("输入有误 名字长度为2 3 4位");
        }
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        if (account > 20){
            this.account = account;
        }else{
            System.out.println("输入有误 余额需要大于20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else{
            System.out.println("输入有误需要为6位数");
        }
    }
    public void info(){
        System.out.println("名字为" + getName() + "\t余额为" + getAccount() + "\t密码为" + getPassword());
    }
}
