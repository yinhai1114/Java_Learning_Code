package com.yinhai.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        // e.TAX_RATE = 0.09;
    }
}
final class A{

}
// class B extends A{} 1)当不希望类被继承时，可以用final修饰.
class C{
    // public final void hi(){ //2)当不希望父类的某个方法被子类覆盖/重写(override)时，可以用final关键字修饰
    //     System.out.println("C类的hi方法");
    // }
}
class D extends C{
    public void hi(){
        System.out.println("重写了子类的hi方法");
    }
}
class E{
    public final double TAX_RATE = 0.08;
}
class F{
    public void cry(){
        final double NUM = 0.01;
        // NUM = 0.9;
        System.out.println(NUM);
    }
}