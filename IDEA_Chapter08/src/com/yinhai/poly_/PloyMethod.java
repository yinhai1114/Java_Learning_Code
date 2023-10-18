package com.yinhai.poly_;

public class PloyMethod {
    public static void main(String[] args) {
        A a = new A();
        a.sum(10,20);
        a.sum(10,20,30);//The method overloading represents polymorphism

        B b = new B();
        a.say();
        b.say(); //The method overriding represents polymorphism
    }
}
class B{
    public void say(){
        System.out.println("This the Class B is used of method");
    }
}
class A extends B {
    public int sum(int n1,int n2){
        return n1 + n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    public void say (){
        System.out.println("This the Class A is used of method");
    }
}