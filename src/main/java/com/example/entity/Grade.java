package com.example.entity;

/***********************************************************************
 * Module:  Grade.java
 * Author:  Administrator
 * Purpose: Defines the Class Grade
 ***********************************************************************/

public class Grade {
    private Float gradeDaily;
    private Float gradeExam;
    private Float gradeTotal;

    private ExamGrade examGrade;
    private ChooseCourse chooseCourse;


    public Float getGradeDaily() {
        return gradeDaily;
    }

    public void setGradeDaily(Float gradeDaily) {
        this.gradeDaily = gradeDaily;
    }

    public Float getGradeExam() {
        return gradeExam;
    }

    public void setGradeExam(Float gradeExam) {
        this.gradeExam = gradeExam;
    }

    public Float getGradeTotal() {
        return gradeTotal;
    }

    public void setGradeTotal(Float gradeTotal) {
        this.gradeTotal = gradeTotal;
    }

    public ExamGrade getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(ExamGrade examGrade) {
        this.examGrade = examGrade;
    }

    public ChooseCourse getChooseCourse() {
        return chooseCourse;
    }

    public void setChooseCourse(ChooseCourse chooseCourse) {
        this.chooseCourse = chooseCourse;
    }
}