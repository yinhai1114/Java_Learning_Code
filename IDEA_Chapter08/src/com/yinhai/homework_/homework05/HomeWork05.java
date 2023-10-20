package com.yinhai.homework_.homework05;

public class HomeWork05 {
    public static void main(String[] args) {
        Peasant peasant = new Peasant(5000);
        Waiter waiter = new Waiter(6000);
        Worker worker = new Worker(4000);
        Teacher teacher = new Teacher(5000, 100, 150);
        Scienist scienist = new Scienist(5000, 20000);
        peasant.printSal();
        waiter.printSal();
        worker.printSal();
        teacher.printSal();
        scienist.printSal();
    }
}
