package com.yinhai.codeblock_;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test a = new Test();//1执行Test类初始化
        //2执行普通属性和普通代码块
        //3构造器
    }
}

class Sample
{
    Sample(String s) {
        System.out.println(s);//有参构造器
    }
    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}
class Test{
    Sample sam1=new Sample("sam1成员初始化");//第3个输出
    static Sample sam=new Sample("静态成员sam初始化 ");//指的只是sam为静态成员，但是等号右边则是创建空间，
    //意思就是sam是静态成员 所以 执行等号右边的创建空间初始化 所以这个是第一个输出的
    static{
        System.out.println("static块执行");//第2个输出
        if(sam==null)System.out.println("sam is null");//现在sum还不是空
    }
    Test()//构造器
    {
        //实际上就是隐藏了super
        //普通属性构造和普通代码块
        System.out.println("Test默认构造函数被调用");//第4个输出
    }
}


