package com.yinhai.interface_.extensvstinterface;

public class ExtendsvsInterface {
    public static void main(String[] args) {
        LittleMonkey houzi = new LittleMonkey("houzi");
        houzi.climbing();
        houzi.swimming();
    }
}
interface Fishable{
    void swimming();
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }
}
class LittleMonkey extends Monkey implements Fishable{

    public LittleMonkey(String name) {
        super(name);
    }
    public void swimming(){
        System.out.println(getName() + "通过学习，可以像鱼一样游泳");
    }
}