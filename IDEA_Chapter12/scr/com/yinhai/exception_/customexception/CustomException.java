package com.yinhai.exception_.customexception;

/**
 * @author 银海
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 0;
        if (!(age >= 18&& age <= 120)) {
            throw new AgeException("年龄需要在18~120之间");
        }
    }
}
//一般继承RuntimeException，把自定义异常做成自定义异常，我们可以使用默认的处理机制
class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}