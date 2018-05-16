package com.example.entity;

/***********************************************************************
 * Module:  Process.java
 * Author:  Administrator
 * Purpose: Defines the Class Process
 ***********************************************************************/

public class Process {
    private Float processCourse;
    private Float processVideo;
    private ChooseCourse chooseCourse;


    public Float getProcessCourse() {
        return processCourse;
    }

    public void setProcessCourse(Float processCourse) {
        this.processCourse = processCourse;
    }

    public Float getProcessVideo() {
        return processVideo;
    }

    public void setProcessVideo(Float processVideo) {
        this.processVideo = processVideo;
    }

    public void setChooseCourse(ChooseCourse chooseCourse) {
        this.chooseCourse = chooseCourse;
    }

    public ChooseCourse getChooseCourse() {
        return chooseCourse;
    }

}