package com.yinhai.homework10_.homework06;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person tangseng = new Person("唐僧");
        tangseng.walk();
        tangseng.walk();
        tangseng.passRiver();
        tangseng.passRiver();
        tangseng.walk();
        tangseng.passRiver();
        //添加一个过火焰山的 正常来说就过一次火焰山，用一次飞机，所以直接用匿名内部类
        //分析应该是基于接口的匿名内部类，内部重写work方法，这个匿名对象只创建一次
        tangseng.flightFlamesMountain();

    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name) {
        this.name = name;
        this.vehicles = Horse.HORSE;
    }
    public void walk(){
        System.out.println("=================");
        System.out.println("走路的时候用马");
        if(!(vehicles instanceof Horse)){//还需要判断一下目前是不是马，是马就不用getHorse
            System.out.println("现在还不是马 骑上白龙马赶路");
            vehicles = VehFactory.getHorse();
        }else{
            System.out.println("现在依然是马，接着赶路");
        }
        vehicles.work();
        System.out.println("=================");
    }
    public void passRiver(){
        System.out.println("=================");
        System.out.println("过河的时候用船");
        if(!(vehicles instanceof Boat)){//还需要判断一下目前是不是船，是船就不用getBoat
            System.out.println("现在还不是船 借一艘船过河");
            vehicles = VehFactory.getBoat();
        }else{
            System.out.println("现在依然是船，接着过河");
        }
        vehicles.work();
        System.out.println("=================");
    }
    public void flightFlamesMountain(){
        System.out.println("=================");
        System.out.println("过火焰山的时候用飞机");
        vehicles = new Vehicles() {
            @Override
            public void work() {
                System.out.println("飞机呼呼飞");
            }
        };
        vehicles.work();
        System.out.println("=================");
    }

}
interface Vehicles{//定义规范 以及方便调用
    void work();
}
class VehFactory{
    public static Horse getHorse(){
        return Horse.HORSE;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Horse implements Vehicles{//需要符合规范而且实现接口
    private String name;
    public static final Horse HORSE = new Horse("白龙马");
    //唐僧骑的是白龙马 所以应该是固定的一匹马
    private Horse(String name){
        this.name = name;
    }
    @Override
    public void work() {
        System.out.println("小马走呀走");
    }
}
class Boat implements Vehicles{//需要符合规范而且实现接口
    @Override
    public void work() {
        System.out.println("小船划呀划");
    }
}