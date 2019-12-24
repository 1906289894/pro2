package com.wb.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component("connectionUtils")
public class ConnectionUtils {

    private ThreadLocal<Connection> t1 = new ThreadLocal<Connection>();

    @Autowired
    private DataSource dataSource;

    //获取当前线程上的连接
    public Connection getThreadConnection(){
        Connection conn = t1.get();

            try {
                if(conn == null) {
                    conn = dataSource.getConnection();
                    t1.set(conn);
                }
                return conn;
            } catch (SQLException e) {
               throw new RuntimeException(e);
            }
    }

    //把连接和线程解绑
    public void removeConnection(){
        t1.remove();
    }

}
