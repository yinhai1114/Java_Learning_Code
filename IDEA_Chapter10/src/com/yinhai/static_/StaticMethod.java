package com.yinhai.static_;

public class StaticMethod {
    //统计学生的学费
    public static void main(String[] args) {
        Stu stu = new Stu("xiaowang");
        stu.payFee(1000);
        Stu stu1 = new Stu("xiaochen");
        stu1.payFee(2000);
        stu1.showFee();
        System.out.println(MyTools.calSum(10 ,20));
    }
}

class MyTools {
    //求出两个数的和
    public static double calSum(double n1, double n2 ){
        return n1 + n2;
    }
}

class Stu {
    private String name;
    private static double fee = 0;


    public Stu(String name) {
        this.name = name;
    }

    //1.当方法使用了static修饰后，该方法就是静态方法
    //2.静态方法就可以访问静态属性
    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有:" + Stu.fee);
    }

}