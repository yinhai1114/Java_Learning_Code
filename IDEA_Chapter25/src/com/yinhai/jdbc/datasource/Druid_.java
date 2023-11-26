package com.yinhai.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class Druid_ {
    @Test
    public static void main(String[] args) throws Exception {

        //1.加入jar包
        //2.加入配置文件
        //3.创建Properties对象 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("IDEA_Chapter25/src/druid.properties"));

        //4.创建一个指定参数的数据库连接池 Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) { //小次数和C3P0差别并不大
            Connection connection = dataSource.getConnection(); //这个方法就是从 DataSource 接口实现的
            //System.out.println("连接OK");
            connection.close();
        }
        System.out.println("连接成功");
        long end = System.currentTimeMillis();
        //c3p0 5000连接mysql 耗时=391
        System.out.println("Druid 5000连接mysql 耗时=" + (end - start));
    }
}
