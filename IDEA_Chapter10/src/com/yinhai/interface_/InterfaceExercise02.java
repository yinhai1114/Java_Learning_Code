package com.yinhai.interface_;

public class InterfaceExercise02 {

}

interface A { // 1min看看
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        // System.out.println(x);//调用的x不知道是哪一个 考虑改为
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}