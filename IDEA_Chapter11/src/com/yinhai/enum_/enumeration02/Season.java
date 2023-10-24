package com.yinhai.enum_.enumeration02;

/**
 * @author 银海
 * @version 1.0
 */
class Season {
    private String name;
    private String desc;
    //3.在Season内部直接创建对象，加上public static
    //4.优化可以加入final修饰符
    public final static Season SPRING = new Season("春天", "暖");
    public final static Season WINTER = new Season("冬天", "寒冷");
    public final static Season AUTUMN = new Season("秋天", "冷");
    public final static Season SUMMER = new Season("夏天", "热");

    //1.私有化构造器

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //2.去掉set方法 防止被修改
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

}
