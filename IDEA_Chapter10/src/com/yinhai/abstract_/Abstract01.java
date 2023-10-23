package com.yinhai.abstract_;

public class Abstract01 {

}
abstract class Animal{
    // public void eat(){System.out.println("eat但不知道谁在吃");}//所以需要抽象方法
        //这里实现了eat（），但其实没有什么意义
        //即 父类方法不确定性的问题
        //===>考虑该方法设计为抽象(abstract)方法
        //==>所谓抽象方法就是没有实现的方法
        //===>所谓没有实现就是指，没有方法体
    abstract public void eat();
        //注意 当一个类中存在抽家方法时，需要将该类声明为abstract类
}
class Cat extends Animal{
    public void eat(){
        System.out.println("小猫在吃....");
    }
}