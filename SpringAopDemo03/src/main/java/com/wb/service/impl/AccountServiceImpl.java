package com.wb.service.impl;

import com.wb.dao.IAccountDao;
import com.wb.domain.Account;
import com.wb.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public Account findAllById(String name) {
        return accountDao.findAllById(name);
    }

    public void transfer(String start, String end, double money) {
        Account account1 = accountDao.findAllById(start);
        Account account2 = accountDao.findAllById(end);
        account1.setMoney(account1.getMoney()-money);
        account2.setMoney(account2.getMoney()+money);

        //开始转账
        accountDao.UpdateAccountMonry(account1);
        accountDao.UpdateAccountMonry(account2);
    }

    public void findAll(){
        accountDao.findAll();
    }
}
