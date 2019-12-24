package com.wb.dao;

import com.wb.domain.Account;

import java.util.List;

public interface IAccountDao {
    //按编号查信息
    Account findAllById(String name);

    void findAll();

    //转账
    void UpdateAccountMonry(Account account);
}
