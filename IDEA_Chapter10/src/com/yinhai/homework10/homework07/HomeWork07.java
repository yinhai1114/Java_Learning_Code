package com.yinhai.homework10_.homework07;

/**
 * @author 银海
 * @version 1.0
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Car car = new Car(500);
        car.useAir();
        Car car1 = new Car(-500);
        car1.useAir();
        Car car2 = new Car(5);
        car2.useAir();
        //注意 成员内部类的使用还可以
        car.new Air().flow();//这么用，但是为了方便懒得这样用，在Car内做一个方法useAir，在里面new Air().flow();
    }
}
class Car{
    private int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("冷风");
            }else if(temperature < 0){
                System.out.println("热风");
            }
            else{
                System.out.println("不吹");
            }
        }
    }
    public void useAir(){
        new Air().flow();
    }
}
