package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    StudentService studentService;

    @RequestMapping("home")
    public Student test() {
        Student student = studentService.find("311501");
        return student;
    }
}
