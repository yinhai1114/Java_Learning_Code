package com.yinhai.poly_.polydetail;

public class PolyDetail {
    public static void main(String[] args) {
        //transition up; the reference to base class point to the object of subclasses
        Animal animal = new Cat();
        //Object obj = new Cat(); //can run? the answer is yes
        //Object also base type of Cat
        animal.eat();//eat method existence in cat class,so output "Cat eating..."
        animal.run();//in cat class,system cant find method,so jump to Animal class to find out eat method
        animal.sleep();//Same as above
        animal.show();//Same as above

        //transition down of polymorphism
        //compilation type is Cat , run type also is Cat
        Cat cat = (Cat) animal;
        //Dog dog = (Dog) animal; // attention , a reference of base class must point to same object of subclasses
        cat.catCatch();//so this line can passing in Cat class to output "Cat catch mouse"
    }
}
