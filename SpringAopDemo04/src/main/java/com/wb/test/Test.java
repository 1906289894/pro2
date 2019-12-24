package com.wb.test;

import com.wb.domain.Account;
import com.wb.service.IAccountService;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Test {
    ApplicationContext ac;
    IAccountService as;

    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("bean.xml");
        as = ac.getBean("accountServiceImpl", IAccountService.class);

    }

    @After
    public void destroy(){

    }

    @org.junit.Test
   public void Test01(){
       Account account = as.findAllById("马云");

           System.out.println(account.getMoney()+" "+account.getName());

   }

    @org.junit.Test
    public void Test03(){
        as.findAll();
    }

   //转账操作
   @org.junit.Test
   public void Test02(){
        //开始转账
        as.transfer("马云","小兵",1000f);
        as.findAll();
    }
}
