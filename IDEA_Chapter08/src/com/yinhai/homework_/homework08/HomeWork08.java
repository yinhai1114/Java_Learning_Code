package com.yinhai.homework_.homework08;

public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);//存10块钱 收取1手续费实际存9元
        checkingAccount.withdraw(10);//取10元 收取1手续费 实际取11元
        System.out.println(checkingAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);//免手续费
        savingAccount.deposit(100);//免手续费
        savingAccount.deposit(100);//免手续费
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);//加收手续费
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();//调用利息计算和重置计数
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);//免手续费
        System.out.println(savingAccount.getBalance());
    }
}
