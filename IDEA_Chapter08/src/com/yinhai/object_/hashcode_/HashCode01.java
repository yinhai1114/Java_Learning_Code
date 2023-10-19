package com.yinhai.object_.hashcode_;

public class HashCode01 {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa2 = aa;
        System.out.println("aa.hashcode " + aa.hashCode());
        System.out.println("aa1.hashcode " + aa1.hashCode());
        System.out.println("aa2.hashcode " + aa2.hashCode());
    }
}
class AA{

}