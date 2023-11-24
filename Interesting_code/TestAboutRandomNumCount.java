package com.yinhai.jdbc.myjdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 一个面试题使用任意编程语言将n个float类型的随机数，
 * 通过比较数据大小的方法从小到大排序(即不可以直接调用排序函数)，
 * 并输出重复次数最多的随机数。
 */
public class TestAboutRandomNumCount {


    public static void main(String[] args) {
        int n = 10;
        float[] randomNum = new float[n];
        // float[] randomNum = {1,2,50,50,50,3,3,8,9,10};//一条测试语句

        for (int i = 0; i < n; i++) {
            randomNum[i] = (float) Math.random();//使用math获得随机数
        }

        //冒泡排序 很基础的东西
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (randomNum[j] > randomNum[j + 1]) {
                    float temp = randomNum[j];
                    randomNum[j] = randomNum[j + 1];
                    randomNum[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(randomNum[i] + "  ");
        }
        System.out.println();
        numCount(randomNum);//调用方法
    }
    public static void numCount(float[] randomNum){
        //使用hashmap
        HashMap<Float, Integer> countNum = new HashMap<>();
        int maxCount = -1;//定义某个数最多出现的次数
        for (float num :randomNum) {//增强循环，将randomNum数组取出，存入该map合集
            int count = 0;
            if(!countNum.containsKey(num)){//如果那个数不存在 就 放进去 计数为1
                countNum.put(num,++count);
                continue;
            }
            count = countNum.get(num);//如果存在，获取该数的count
            countNum.put(num,++count);//更新该num数的次数 map直接put会根据k值重复替换
            if(count > maxCount){ //记录最大的maxCount值方便下面输出
                maxCount = count;
            }
        }
        System.out.println(countNum);
        //找出最大的出现次数的数 包括多个数的情况
        ArrayList<Float> maxFloats = new ArrayList<>();
        Set<Float> floats = countNum.keySet();
        for (float num :floats) {//循环取出map
            Integer count = countNum.get(num);//获取count
            if(count == maxCount){//如果count的次数是我们上面记录的最大次数
                maxFloats.add(num);//就把该value的key添加到arraylist内
            }
        }
        if(maxCount == -1){
            System.out.println("没有最多出现的数");
            return;
        }
        System.out.println("最多重复出现的数为" + maxFloats +"出现了" + maxCount + "次");
    }
}
