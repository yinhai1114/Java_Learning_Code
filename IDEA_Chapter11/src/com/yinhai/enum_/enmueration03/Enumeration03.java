package com.yinhai.enum_.enmueration03;

/**
 * @author 银海
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
        
}
enum Season {
    //1.使用enum代替class
    //2.//常量名(实参列表);
    //3.如果有多个常量(对象)
    SPRING("春天", "暖"),WINTER("冬天", "寒冷"),AUTUMN("秋天", "冷"),
    SUMMER("夏天", "热"),WHAT(),WHAAAT;
    private String name;
    private String desc;
    private Season(){

    }
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    // public String getName() {
    //     return name;
    // }
    public String getDesc() {
        return desc;
    }

}
abstract class A{

}
class B extends A{
    
}