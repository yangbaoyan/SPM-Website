package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    StudentService studentService;

    @ResponseBody
    public Student getStudent(HttpServletRequest httpServletRequest) {
        String id = httpServletRequest.getParameter("id");
        return studentService.find(id);
    }
}
