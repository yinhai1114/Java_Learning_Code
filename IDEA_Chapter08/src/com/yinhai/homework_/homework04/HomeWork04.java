package com.yinhai.homework_.homework04;

public class HomeWork04 {
    public static void main(String[] args) {
        Manager xiaowang = new Manager("小王",100,31);
        Staff xiaochen = new Staff("小陈", 400, 31);
        xiaowang.setBonus(1000);
        xiaowang.printSalary();
        xiaochen.printSalary();
    }
}
