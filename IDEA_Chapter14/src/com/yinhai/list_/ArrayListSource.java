package com.yinhai.list_;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 银海
 * @version 1.0
 */

public class ArrayListSource {
    public static void main(String[] args) {
        //注意，注意，注意，Idea 默认情况下，Debug 显示的数据是简化后的，如果希望看到完整的数据
        //需要做设置.
        //使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();
        // ArrayList list = new ArrayList(8);
        //使用for给list集合添加 1-10数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //使用for给list集合添加 11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
