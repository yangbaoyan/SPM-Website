package com.example.entity;

/***********************************************************************
 * Module:  ExamGrade.java
 * Author:  Administrator
 * Purpose: Defines the Class ExamGrade
 ***********************************************************************/

public class ExamGrade {
    private Integer id;
    private Exam exam;
    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}