package com.yinhai.enum_.enummethos;

/**
 * @author 银海
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn.ordinal());//输出该对象的枚举编号  //从0开始编号，AUTUMN枚举对象是第二个因此输出2
        Season[] values = Season.values();
        for(Season season:values){//增强for循环，执行的流程是依次从数组中取出数据赋给i，如果取完退出增强for循环
            System.out.println(season);//调用的是toString方法，我们子类重写了，所以根据我们的toString应该返回常量内的属性
        }
        //valueOf将字符串转换成枚举对象，要求字符串必须为已有的常量名， 否则报异常
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println(autumn1);

        //6. compareTo:比较两个枚举常量，比较的就是位置号
        System.out.println(Season.SPRING.compareTo(Season.SUMMER));

    }
}
enum Season {
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
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}