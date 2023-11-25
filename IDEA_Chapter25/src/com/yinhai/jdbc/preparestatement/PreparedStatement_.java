package com.yinhai.jdbc.preparestatement;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //让用户输入管理员名和密码
        System.out.print("请输入管理员的名字: ");  //next(): 当接收到 空格或者 '就是表示结束
        String admin_name = scanner.nextLine(); // 说明，如果希望看到SQL注入，这里需要用nextLine
        System.out.print("请输入管理员的密码: ");
        String admin_pwd = scanner.nextLine();

        //通过Properties对象获取配置文件的信息


        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
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
        //3.1组织SqL
        String sql = "select name,pwd from admin where name = ? and pwd = ?";//sql语句要写在pre之前
        //3.2preparedStatement 对象实现了 PreparedStatement 接口的实现类的对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.3给?赋值
        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);

        //执行select使用executeQuery
        ResultSet resultSet = preparedStatement.executeQuery();//这里面的sql不要再写sql了 , 已经被prepareStatement处理过了
        //如果执行的是dml语句（update,insert,delete）executeUpdate()
        if (resultSet.next()) { //如果查询到一条记录，则说明该管理存在
            System.out.println("恭喜， 登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
