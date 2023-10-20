package com.yinhai.smallchangesys.oop_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    完成各个功能的类
    使用面向对象编程
 */
public class SmallChangeSysOOP {
    //define parameter
    boolean loop = true;
    String key = "";
    //2.完成零钱通明细
    String details = "---------------- 零钱通明细 ----------------";
    //3.完成收益入账 定义新变量
    double money = 0;
    double balance = 0;
    Scanner scanner = new Scanner(System.in);
    Date date = null;//java.util.Date 表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd HH:mm");
    //可以用于日期格式化 年-月-日 时：秒

    //4.定义新的变量 保存消费的说明
    String note = "";
    public void displayMenus(){
        do{
            System.out.println("\n============= 零钱通菜单 ==============");
            System.out.println("\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t 2 收益入账");
            System.out.println("\t\t\t 3 消费");
            System.out.println("\t\t\t 4 退出");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请选择1 - 4");
            key = scanner.next();
            switch (key){
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while(loop);
    }
    public void detail(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        if(money <= 0){
            System.out.println("入账不能为非整数");
            return;
        }
        //money是需要校验的
        balance += money;
        //拼接收益入账信息到details
        date = new Date();
        // System.out.println(date);//需要对该数据进行处理
        details += "\n" + "收益入账\t" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
    }
    public void pay(){
        System.out.println("输入消费的金额");
        money = scanner.nextDouble();//money是需要校验的
        if(money <= 0 || money > balance){
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        balance -= money;
        System.out.println("输入消费的说明");
        note = scanner.next();
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
    }
    public void exit(){
        System.out.println("4 退出");
        //5.定义一个变量接受用户输入
        String choice = "";
        while(true){
            System.out.println("确定要退出吗y/n");
            choice = scanner.next();
            if(choice.equals("y") || choice.equals("n")) {//一段代码一个功能
                break;
            }
        }
        if(choice.equals("y")){
            loop = false;
        }
    }
}