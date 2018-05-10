package com.example.entity;

/***********************************************************************
 * Module:  Exam.java
 * Author:  Administrator
 * Purpose: Defines the Class Exam
 ***********************************************************************/

public class Exam {
    private Integer iD;
    private String examAddress;
    private String examDate;

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getExamAddress() {
        return examAddress;
    }

    public void setExamAddress(String examAddress) {
        this.examAddress = examAddress;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
}