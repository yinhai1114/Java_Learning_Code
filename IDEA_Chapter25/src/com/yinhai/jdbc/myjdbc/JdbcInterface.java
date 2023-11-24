package com.yinhai.jdbc.myjdbc;

/**
 * @author 银小海
 * @version 1.0
 * @email yinhai14@qq.com
 */
public interface JdbcInterface {

    public Object getConnection();
    //开启连接
    public void crud();
    //关闭连接
    public void close();
}
