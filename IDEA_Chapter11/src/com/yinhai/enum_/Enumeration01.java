package com.yinhai.enum_;

/**
 * @author 银海
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season season = new Season("spring", "worm");
        Season season1 = new Season("winter", "cold");
        Season season2 = new Season("summer", "hot");
        Season season3 = new Season("autumn", "cold");
        //对于季节而言，是固定的四个 不会有更多
        //因此这样设计不好，所以引出枚举类，把对象一个个列举出来
        Season other = new Season("asdasdas", "~~~~~~~~~");
    }
}
class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}