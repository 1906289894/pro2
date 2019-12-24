package com.wb.service;

import com.wb.dao.BookDao;
import com.wb.domain.Book;
import com.wb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService {
    @Autowired
    private User user;

    @Autowired
    private BookDao bookDao;

    public User createUser(){
        user.setId(1);
        user.setUsername("王斌");
        user.setPassword("wangbin123");
        return user;
    }

    public void findAll(){
        List<Book> books = bookDao.findAllBook();
        for(Book book:books){
            System.out.println(book.getBookname()+" "+book.getAuthor());
        }
    }

}
