package com.yinhai.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);//此时使用n1并没有创建cat对象
        Cat instance = Cat.getInstance();//创建对象
        Cat instance1 = Cat.getInstance();//因为对象不为空，所以只会创建一次
        System.out.println(instance == instance1);
    }
}
class Cat{
    private String name;
    public static int n1 = 100;
    private static Cat cat;
    //1）仍然构造器私有化
    // 2）定义一个static静态属性对象
    // 3）提供一个public的static方法，可以返回一个Cat对象
    private Cat(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat == null){//如果还没有创建cat对象
            cat = new Cat("xiaohua");
        }
        return cat;
    }

}