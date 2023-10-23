package com.yinhai.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        // GirlFriend xiaohuang = new GirlFriend("xiaohuang");
        // GirlFriend xiangwang = new GirlFriend("xiangwang");
        //通过方法就可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);

    }
}
class GirlFriend{
    private String name;

    //为了能够在静态方法中使用，需要static修饰
    private static GirlFriend gf = new GirlFriend("hong");//2
    //如何保障只能创建一个GirlFriend对象？
    //1.私有化构造器
    //2.在类的内部创建对象
    //3.提供一个公共的静态static方法 返回gf对象
    private GirlFriend(String name) {//1
        this.name = name;
    }
    public static GirlFriend getInstance(){//3
        return gf;
    }
}