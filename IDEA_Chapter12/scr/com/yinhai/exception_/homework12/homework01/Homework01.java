package com.yinhai.exception_.homework12.homework01;

/**
 * @author 银海
 * @version 1.0
 */
/*a)编写应用程序EcmDef,接收命令行(用main方法后面的String[] args接受)的两个参数(整数)，计算两数相除。

 b)计算两个数相除，要求使用方法cal(int n1, int n2)

 c)对数据格式不正确、缺少命令行参数、除0进行异常处理。
*/

 public class Homework01 {
    public static void main(String[] args) {

        //验证输入的个数是否正确
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("数组长度异常");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1,n2);//该方法可能抛出算术异常
            System.out.println("算术结果是" + res);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("参数个数不对");
        }
        catch (NumberFormatException e) {
            System.out.println("参数格式不对，请输入整数");
        }catch (ArithmeticException e){
            System.out.println("出现除数为0");
        }


    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}

