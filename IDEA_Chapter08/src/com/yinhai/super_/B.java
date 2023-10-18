package com.yinhai.super_;

public class B extends A{

    public B(){
        super(50);
    }
    public void ok(){
        int num = n1;
        say(); //要按照查找关系来返回信息
        //1.首先查看子类是否有该方法
        //2.如果子类有该方法而且可以访问，则返回信息
        // 3.如果子类没有这个方法，就看父类有没有这个方法（如果有而且可以访问，就返回该信息
        //所以这里返回的就是Default里面的
        super.say();//找say方法直接在父系中找
        this.say();//等价于say(); 规则相同

    }
}
