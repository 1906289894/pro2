package com.wb.service;

import com.wb.domain.Account;

import java.util.List;

public interface IAccountService {


    /**
     * 按编号查信息
     * @return
     */
    Account findAllById(String name);

    /**
     * 转账操作
     * @param start
     * @param end
     * @param money
     */
    void transfer(String start, String end, double money);

    /**
     * 查询全部
     */
    void findAll();
}
