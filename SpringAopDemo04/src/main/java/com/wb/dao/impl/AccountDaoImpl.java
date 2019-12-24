package com.wb.dao.impl;

import com.wb.dao.IAccountDao;
import com.wb.domain.Account;
import com.wb.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    //注入线程连接connection
    @Autowired
    private ConnectionUtils connectionUtils;

    //注入C3p0封装类queryQunner
    @Autowired
    private QueryRunner runner;

    //持久层按姓名查询信息
    public Account findAllById(String name) {
        String sql = "select * from account where name = ? ";
        try {
            Account account =  runner.query(connectionUtils.getThreadConnection(),sql,new BeanHandler<Account>(Account.class),name);
            return account;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //查询全部
    public void findAll() {
        String sql = "select * from account ";
        try {
            List<Account> accounts = runner.query(connectionUtils.getThreadConnection(),sql,new BeanListHandler<Account>(Account.class));
            for (Account account:accounts){
                System.out.println(account.getId()+"  "+account.getName()+"  "+account.getMoney());
            }
        } catch (SQLException e) {

        }

    }

    //转账
    public void UpdateAccountMonry(Account account) {
        String sql = "update account set money = ?,name = ? where id = ?";
        try {
            runner.update(connectionUtils.getThreadConnection()
            ,sql,account.getMoney(),account.getName(),account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
