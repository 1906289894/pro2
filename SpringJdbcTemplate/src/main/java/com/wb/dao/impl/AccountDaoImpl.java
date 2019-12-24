package com.wb.dao.impl;

import com.wb.dao.IAccountDao;
import com.wb.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;
import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {


    public Account findAllById(String name) {
        return null;
    }

    public void findAll() {

    }

    public void UpdateAccountMonry(Account account) {

    }
}
