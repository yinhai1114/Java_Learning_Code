package com.yinhai.homework_;

class Test {
    String name = "Rose";

    Test() {
        System.out.println("Test");
    }

    Test(String name) {//堆里的对象name = 传入的值
        this.name = name;
    }
}//父类

class Demo extends Test {//子类
    String name = "Jack";

    Demo() {//在创建对象时执行无参构造器初始化
        super();//父类的无参构造
        System.out.println("Demo");
    }

    Demo(String s) {//创建对象时该构造器初始化
        super(s);//父类的String构造器
    }

    public void test() {//根据查找关系使用该方法 super为父类name为Rose
        //this为本类开始查找为Jack
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Demo().test();
        new Demo("john").test();
    }

}
//1.out Test    2.out Demo      3.out Rose      4.out Jack
//1.out john    2.out Jack