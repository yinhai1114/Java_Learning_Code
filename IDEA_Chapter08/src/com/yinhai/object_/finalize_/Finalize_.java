package com.yinhai.object_.finalize_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw = null;
        //currently,object of Car is garbage,
        // garbage collector will recycling object
        // the finalize method is called before recycling the object
        //so we can override this finalize method.
        // inside Object class,the finalize method does nothing by default
        //default handling

        System.gc();//note,possibly this is not immediately called,maybe be occupied with System or busy
        //can look that finalize cant running , why?
        //because they have unique algorithm inside system,does not immediately run
        //so we can use System.GC() to running garbage collector mechanism.
        //but
        System.out.println("Program exit...");
    }
}

class Car{
    private String name;
    public Car(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("we recycling car" + name);
        System.out.println("release space...");
    }
}