package com.wb.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jt = (JdbcTemplate)ac.getBean("jdbcTemplate");
        //jt.query("select * from account",new AccountRowMapper());
    }
}
