package com.example.entity;
/***********************************************************************
 * Module:  Process.java
 * Author:  Administrator
 * Purpose: Defines the Class Process
 ***********************************************************************/

public class Process {
    private Integer iD;
    private Float processCourse;
    private Float processVideo;
    private ChooseCourse chooseCourse;

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

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