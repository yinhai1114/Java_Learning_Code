package com.yinhai.homework11;

/**
 * @author 银海
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        IMyColor iMyColor = Color.BLACK;//没有想出来接口除了这里能用还有哪里能用
        //也没有啥好处啊，方便以后拓展SRGB?或者HSB?但颜色范围也对不上啊，不懂
        iMyColor.show();
        switch ((Color)iMyColor){
            case RED:
                System.out.println("匹配为红色");
                break;
            case BLUE:
                System.out.println("匹配为蓝色");
                break;
            case BLACK:
                System.out.println("匹配为黑色");
                break;
            case GREEN:
                System.out.println("匹配为绿色");
                break;
            case YELLOW:
                System.out.println("匹配为黄色");
                break;
            default:
                System.out.println("啥都不是");
        }
    }
}
interface IMyColor{
    void show();
}
enum Color implements IMyColor{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    public void show(){
        System.out.println(redValue + " " + greenValue + " " + blueValue);
    }
}