package com.yinhai.innerclass_;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 { //外部类
    private int n1 = 10;//属性
    public void method() {//方法
        //基于接口的匿名内部类
        //1.需求： 想使用IA接口,并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        // 3.需求是 Tiger/Dog 类只是使用一次，后面再不使用
        // IA tiger = new Tiger();
        // tiger.cry();//4. 可以使用匿名内部类来简化开发

        //7. jdk底层在创建匿名内部类 Outer04$1,立即马上就创建了 Outer04$1实例，并且把地址返回给 tiger

        IA tiger = new IA() {//创建了IA的实例 就使用了一次
            //5. tiger的编译类型是IA
            //6. tiger的运行类型就是匿名内部类  Outer04$1
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());//类名 getClass就是获取运行类型
        tiger.cry();
        tiger.cry();
        tiger.cry();//8. 匿名内部类使用一次，就不能再使用 但是对象可以再调用,已经把地址指向了一个空间
        /*运行类型
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */


        //演示基于类的匿名内部类
        //1. father编译类型 Father  2. father运行类型是Outer04$2，不带大括号就是Father
        Father father = new Father("jack"){//匿名内部类 5. 注意("jack") 参数列表会传递给 构造器

            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer04$2
        father.test();
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //4. 同时也直接返回了 匿名内部类 Outer04$2的对象



        //基于抽象类的匿名内部类
        //抽象类必须实现抽象类的方法
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}

interface IA {//接口
    public void cry();
}
class Tiger implements IA {//传统的使用方法

   @Override
   public void cry() {
       System.out.println("老虎叫唤...");
   }
}
class Dog implements  IA{
   @Override
   public void cry() {
       System.out.println("小狗汪汪...");
   }
}

class Father {//类
    public Father(String name) {//构造器
        System.out.println("接收到name=" + name);
    }
    public void test() {//方法
    }
}

abstract class Animal { //抽象类
    abstract void eat();
}