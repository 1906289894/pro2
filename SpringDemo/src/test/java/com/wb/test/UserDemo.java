package com.wb.test;

import com.wb.dao.IUserDao;
import com.wb.domain.User;
import com.wb.service.IUserService;
import com.wb.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {
    ApplicationContext ac = null;
    @Before
    public void before(){
        ac = new ClassPathXmlApplicationContext("bean.xml");
    }

    @Test
    public void Test2(){
        IUserDao userdao = (IUserDao) ac.getBean("userdao");
        userdao.Test();
    }

    @Test
    public void Test(){
        User user = ac.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void Test1(){
        IUserService userService = ac.getBean("userService", IUserService.class);
        userService.findUser();

    }
}
