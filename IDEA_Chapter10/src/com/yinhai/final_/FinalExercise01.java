package com.yinhai.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(Cirle.cal(6));
    }
}
class Cirle{
    private final static double PI = 3.14;
    public static double cal(double radius){
        return radius * radius * PI;
    }
}