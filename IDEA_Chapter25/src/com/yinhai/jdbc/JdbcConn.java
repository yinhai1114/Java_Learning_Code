package com.yinhai.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public class JdbcConn {
    public static void main(String[] args) {

    }
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();

        String url = "jdbc:mysql://localhost:3306/yh_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");//用户
        properties.setProperty("password","1114");//密码
        Connection connect = driver.connect(url, properties);//尝试连接
        System.out.println(connect);
    }
    //2.使用反射加载Driver类 , 动态加载，更加的灵活，减少依赖性
    @Test
    public void connect02() throws SQLException, Exception {
        //使用反射加载Driver类
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/yh_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");//用户
        properties.setProperty("password","1114");//密码
        Connection connect = driver.connect(url, properties);//尝试连接
        System.out.println(connect);
    }
    //方式3 使用DriverManager 替代 driver 进行统一管理
    @Test
    public void connect03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        //创建url和user和password
        String url = "jdbc:mysql://localhost:3306/yh_db02";
        String user = "root";
        String password = "1114";

        DriverManager.registerDriver(driver);//注册driver驱动
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);

    }
    //方式4: 使用Class.forName 自动完成注册驱动，简化代码
    //这种方式获取连接是使用的最多，推荐使用
    @Test
    public void connect04() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        /*源码: 1. 静态代码块，在类加载时，会执行一次.
            2. DriverManager.registerDriver(new Driver());
            3. 因此注册driver的工作已经完成
        public class Driver extends NonRegisteringDriver implements java.sql.Driver {
            public Driver() throws SQLException {
            }

            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
           }
         */
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        /*  上面这句话可以不要
            1. mysql驱动5.1.6可以无需CLass.forName("com.mysql.jdbc.Driver");
            2.从jdk1.5以后 使用了jdbc4,不再需要显示调用class.forName()注册驱动
            而是自动调用驱动jar包下META-INF\services\av.sql.Driver文本中的类名称去注册
            3.建议还是写上CLass.forName
         */
        //创建url和user和password
        String url = "jdbc:mysql://localhost:3306/yh_db02";
        String user = "root";
        String password = "1114";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }
    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);//加载驱动

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("" + connection);
    }
    @Test
    public void connectTest() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);//加载驱动
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        // statement.executeUpdate("CREATE TABLE news(" +
        //         "id INT PRIMARY KEY AUTO_INCREMENT," +
        //         "content varchar(128))");
        // statement.executeUpdate("insert into news value(null, 'hellllllllllllllllllllo1')");
        // statement.executeUpdate("insert into news value(null, 'hellllllllllllllllllllo2')");
        // statement.executeUpdate("insert into news value(null, 'hellllllllllllllllllllo3')");
        // statement.executeUpdate("insert into news value(null, 'hellllllllllllllllllllo4')");
        // statement.executeUpdate("insert into news value(null, 'hellllllllllllllllllllo5')");
        statement.executeUpdate("update news set content = 'yinhaiMeow' where id = 1");
        statement.executeUpdate("delete from news where id = 3");

        //4.关闭连接
        statement.close();//用完后记得及时关闭
        connection.close();
    }
}
