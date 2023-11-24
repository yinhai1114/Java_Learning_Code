package com.yinhai.jdbc.resultset;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class ResultSet01 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("IDEA_Chapter25/src/mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //1. 注册驱动
        Class.forName(driver);//建议写上

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. 得到Statement
        Statement statement = connection.createStatement();
        //4. 组织SqL
        String sql = "select id, name , sex, borndate from actor";
        //执行给定的SQL语句，该语句返回单个 ResultSet对象
        /*
        +----+-----------+-----+---------------------+
        | id | name      | sex | borndate            |
        +----+-----------+-----+---------------------+-------+
        |  4 | 刘德华    | 男  | 1970-12-12 00:00:00 |
        |  5 | 周星驰      | 男  | 1990-11-11 00:00:00 |
        +----+-----------+-----+---------------------+-------+
         */
        /*
            阅读debug 代码 resultSet 对象的结构


         */
        ResultSet resultSet = statement.executeQuery(sql);

        //5. 使用while取出数据
        while (resultSet.next()) { // 让光标向后移动，如果没有更多行，则返回false
            int id  = resultSet.getInt(1); //获取该行的第1列
            //int id1 = resultSet.getInt("id"); 通过列名来获取值, 推荐
            String name = resultSet.getString(2);//获取该行的第2列
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);


            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        //6. 关闭连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}

