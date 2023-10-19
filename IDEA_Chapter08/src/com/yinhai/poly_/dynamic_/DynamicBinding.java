package com.yinhai.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//40 -->30
        System.out.println(a.sum1());//30 --> 20
    }
}
class A {
    public int i = 10;
    public int sum(){//run this statement
        return getI() + 10;//and run getI , so here is a question ,where is run to? is A or B?
        //so elicitation dynamic binding

        //mechanism of dynamic binding
        //1.when running object method,this object method will bind to run type
        //so getI will use method of class B
        //output 30
        //2.when running parameter of object,have not dynamic binding! in other way , where declaration where used
    }
    public int sum1(){
        return i + 10;//so run this line,here is will return i,this parameter is class A,have not dynamic binding!
    }
    public int getI(){
        return i;
    }
}
class B extends A{
    public int i = 20;
    // public int sum(){
    //     return getI() + 10; //to find class A of sum method ,if be annotated with this statement
    // }
    // public int sum1(){
    //     return i + 10; //to find sum method of class A ,if be annotated with this statement
    // }
    public int getI(){
        return i; //not dynamic binding
    }
}