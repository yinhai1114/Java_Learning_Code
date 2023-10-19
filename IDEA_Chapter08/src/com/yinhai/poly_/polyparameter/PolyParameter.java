package com.yinhai.poly_.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Employee boss = new Manger("boss",20000,120000);
        Employee xiaowang = new OrdinaryStaff("xiaowang", 2000);
        A a = new A();
        a.showEmpAnnal(boss);
        a.showEmpAnnal(xiaowang);
        a.testWork(boss);
        a.testWork(xiaowang);
    }
}
class A{
    public void showEmpAnnal(Employee e){
        System.out.println(e.getName() + " " +  e.getAnnual()) ;
    }
    public void testWork(Employee e){
        if(e instanceof Manger){
            ((Manger) e).manage();
        }else if (e instanceof OrdinaryStaff){
            ((OrdinaryStaff) e).work();
        }
    }
}
