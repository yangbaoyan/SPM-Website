package com.example.controller;

import com.example.service.StudentService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/home")
    public ModelAndView home(HttpServletRequest httpServletRequest, ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
