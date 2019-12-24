package com.wb.dao.impl;

import com.wb.dao.IUserDao;
import com.wb.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    QueryRunner queryRunner = null;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void findAllUser(){
        String sql = "select * from user";
        try {
            List<User> userList = queryRunner.query(sql, new BeanListHandler<User>(User.class));
            for (User user:userList){
                System.out.println(user.getUsername()+"  "+user.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Test() {
        System.out.println("吃饭了吗？？？");
    }
}
