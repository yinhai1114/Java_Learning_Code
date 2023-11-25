package com.yinhai.jdbc.preparestatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class Work01 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        //使用反射加载Driver类
        Properties properties = new Properties();
        properties.load(new FileInputStream("IDEA_Chapter25/src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class<?> aClass = Class.forName(driver);
        Connection connection = DriverManager.getConnection(url,user,password);
        String sql = "create table admin( \n " +
                "name VARCHAR(32) NOT NULL UNIQUE,\n" +
                "pwd VARCHAR(32) NOT NULL DEFAULT '')";
        String sql1 = "INSERT INTO admin VALUES('tom', '123') " +
                ",('tom1', '123')" +
                ",('tom2', '123')" +
                ",('tom3', '123')" +
                ",('tom4', '123')" +
                "";
        String sql2 = "update admin set name = 'king' where name = 'tom'";
        String sql3 = "delete from admin where name = 'tom2'";
        String sql4 = "select * from admin";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
        PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
        PreparedStatement preparedStatement3 = connection.prepareStatement(sql3);
        PreparedStatement preparedStatement4 = connection.prepareStatement(sql4);

        // preparedStatement.executeUpdate();
        // preparedStatement1.executeUpdate();
        // preparedStatement2.executeUpdate();
        // preparedStatement3.executeUpdate();
        ResultSet resultSet = preparedStatement4.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String pwd = resultSet.getString("pwd");
            System.out.println(name + " " + pwd);
        }

        resultSet.close();
        connection.close();
        // preparedStatement.close();
        // preparedStatement1.close();
        // preparedStatement2.close();
        // preparedStatement3.close();
        preparedStatement4.close();

    }
}
