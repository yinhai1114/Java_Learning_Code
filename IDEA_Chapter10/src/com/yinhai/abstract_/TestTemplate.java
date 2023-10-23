package com.yinhai.abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        aa.calWorkTime();
        bb.calWorkTime();
    }
}
abstract class Template{
    public abstract void job();
    public void calWorkTime(){
        long start = System.currentTimeMillis();
        job();//动态绑定机制，调用的是对象所在类内的方法，没有再往上查找
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start) + "ms");
    }
}
class AA extends Template{

    public void job() {
        long num = 0;
        for (long i = 0; i < 1000000; i++) {
            num += i;
        }
    }
}
class BB extends Template{
    public void job() {
        long num = 0;
        for (long i = 0; i < 2000000; i++) {
            num += i;
        }
    }
}