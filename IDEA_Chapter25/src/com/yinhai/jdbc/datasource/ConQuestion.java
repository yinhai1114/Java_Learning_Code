package com.yinhai.jdbc.datasource;

import com.yinhai.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class ConQuestion {

    //代码 连接mysql 5000次
    @Test
    public void testCon() {

        //看看连接-关闭 connection 会耗用多久
        long start = System.currentTimeMillis();
        System.out.println("开始连接.....");
        for (int i = 0; i < 5000; i++) {
            //使用传统的jdbc方式，得到连接
            Connection connection = JDBCUtils.getConnection();
            //做一些工作，比如得到PreparedStatement ，发送sql
            //..........
            //关闭
            JDBCUtils.close(null, null, connection);//如果不关闭 mysql会爆掉

        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式5000次 耗时=" + (end - start));//传统方式5000次 频繁链接关闭耗时会非常长 耗时=8502
    }
}
