package com.yinhai.smallchangesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //1.complete display menu and chose menu and then output tip
    public static void main(String[] args) {
        //define parameter
        boolean loop = true;
        String key = "";
        //2.完成零钱通明细
        String details = "---------------- 零钱通明细 ----------------";

        //3.完成收益入账 定义新变量
        double money = 0;
        double balance = 0;
        Date date = null;//java.util.Date 表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd HH:mm");
        //可以用于日期格式化 年-月-日 时：秒

        //4.定义新的变量 保存消费的说明
        String note = "";

        //run at least once,so use do while
        do{
            System.out.println("\n============== 零钱通菜单 ==============");
            System.out.println("\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t 2 收益入账");
            System.out.println("\t\t\t 3 消费");
            System.out.println("\t\t\t 4 退出");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请选择1 - 4");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    if(money <= 0){
                        System.out.println("入账不能为非整数");
                        break;
                    }
                    //money是需要校验的
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();
                    // System.out.println(date);//需要对该数据进行处理
                    details += "\n" + "收益入账\t" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    break;
                case "3":
                    System.out.println("输入消费的金额");
                    money = scanner.nextDouble();//money是需要校验的
                    if(money <= 0 || money > balance){
                        System.out.println("消费金额应该在0-" + balance);
                        break;
                    }
                    balance -= money;
                    System.out.println("输入消费的说明");
                    note = scanner.next();
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while(loop);
        System.out.println("退出了零钱通项目");
    }
}
