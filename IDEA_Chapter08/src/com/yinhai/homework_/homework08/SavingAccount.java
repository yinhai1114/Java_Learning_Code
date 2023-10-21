package com.yinhai.homework_.homework08;

public class SavingAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }


    public void earnMonthlyInterest() {
        count = 3;
        super.deposit((getBalance()) * rate);
        //调用存款方法，传入getBanlce * rate
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            count--;
            super.deposit(amount);
        } else {
            super.deposit(amount);
        }

    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            count--;
            super.withdraw(amount);
        } else {
            super.withdraw(amount);
        }

    }
}
