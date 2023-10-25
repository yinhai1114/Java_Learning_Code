package com.yinhai.enum_.enumexercise02;

/**
 * @author 银海
 * @version 1.0
 */
public class EnmuExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week week:values){
            System.out.println(week);
        }

    }
}
//声明枚举类
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),
    SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}