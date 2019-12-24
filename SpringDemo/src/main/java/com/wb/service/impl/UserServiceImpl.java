package com.wb.service.impl;

import com.wb.dao.IUserDao;
import com.wb.dao.impl.UserDaoImpl;
import com.wb.service.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserDao iUserDao = null;

    public void setiUserDao(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    public void findUser() {
        iUserDao.findAllUser();
    }
}
