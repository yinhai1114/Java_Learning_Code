package com.yinhai.homework10_.homework05;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.new B().show();
        a.f1();
    }
}
class A {
    private String name = "我是外部类的name";
    class B{
        private String name = "我是内部类的name";
        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(B.this.name);
            System.out.println(A.this.name);
            //其实可以看做我们对象名前的类名限定了对象的访问范围
        }//如果想要打印，外部类的name变量，可以使用类名.this.name;
    }//如果想要访问成员内部类的show方法 需要编写方法返回一个成员内部类的对象然后嗲用
    //或者是在外部其他类直接调用
    //如果是局部内部类，需要写在方法内
    public void f1(){
        class B{
            private String name = "我是局部内部类";
            public void show(){
                System.out.println(name);
                System.out.println(this.name);
                System.out.println(A.this.name);

            }
        }
        //如果想在外部其他类访问局部内部类 需要在方法体内创建对象
        new B().show();
    }
}