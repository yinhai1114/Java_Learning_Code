package com.yinhai.jdbc;


import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 * 这是第一个Jdbc程序 完成简单操作
 */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new Driver();

        //2.得到连接
        //(1) jdbc:mysql:// 规定好表示协议，通过jdbc的方式连接mysql
        //(2) localhost 主机，可以是ip地址
        //(3) 3306 表示mysql监听的端口
        //(4) hsp_db02 连接到mysql dbms 的哪个数据库
        //(5) mysql的连接本质就是前面学过的socket连接
        String url = "jdbc:mysql://localhost:3306/yh_db02";
        //将 用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        //说明 user和password是规定号的，后面的值根据实际情况写
        properties.setProperty("user","root");//用户
        properties.setProperty("password","1114");//密码
        Connection connect = driver.connect(url, properties);//尝试连接

        //3.执行sql
        String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11', '110')";//插入
        // String sql = "update actor set name = '周小川' where id = 1";//修改
        // String sql = "delete from actor where id = 1";
        Statement statement = connect.createStatement();//这个对象可以帮助执行静态sql语句并返回其生成的结果对象
        int rows = statement.executeUpdate(sql);//返回的是影响的行数

        System.out.println(rows > 0 ? "成功" : "失败");

        //4.关闭连接
        statement.close();//用完后记得及时关闭
        connect.close();
    }
}
