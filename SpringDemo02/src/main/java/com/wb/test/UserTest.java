package com.wb.test;


import com.wb.service.UserService;
import com.wb.utils.CreateConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(CreateConfiguration.class);
        UserService userService = ac.getBean("UserService", UserService.class);
        userService.findAll();
    }
}
