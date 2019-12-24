package com.wb.dao;

import com.wb.domain.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@Repository("BookDao")
public class BookDao {

    @Autowired
    private QueryRunner runner;


    List<Book> list;
    public List<Book> findAllBook(){
        String sql = "select * from book";
        try {
            list = runner.query(sql, new BeanListHandler<Book>(Book.class));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
