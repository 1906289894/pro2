package com.wb;

import com.wb.domain.Student;
import com.wb.studentmapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class MySpringbootApplication {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<Student> show(){

        List<Student> students = userMapper.queryStudentList();
       return students;

    }



}
