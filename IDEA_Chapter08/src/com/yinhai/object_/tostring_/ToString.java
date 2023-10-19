package com.yinhai.object_.tostring_;

public class ToString {

    public static void main(String[] args) {
        // public String toString() {
        //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }return getClass().getName()//this full class name
        // And then the next one is hashcode
        Monster monster = new Monster("little goblin", "mountain patrol", 3000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());
        //have not override so this statement call method of the base class
        System.out.println(monster);//3.toString method is called by default,when direct output
        //remember,when comment out toString of Monster,it will to call in method of Object
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    //use shortcuts alt + insert --> toString

    @Override
    public String toString() {//2. override toString method
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';//in general,default output parameter of object
    }
}