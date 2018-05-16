package com.example.entity;


import com.jeff.tianti.common.entity.BaseEntity;

/***********************************************************************
 * Module:  Teacher.java
 * Author:  Administrator
 * Purpose: Defines the Class Teacher
 ***********************************************************************/

public class Teacher extends BaseEntity {
    private String teacherIndate;
    private String teacherDuty;
    private UserInfo userInfo;

    public String getTeacherIndate() {
        return teacherIndate;
    }

    public void setTeacherIndate(String teacherIndate) {
        this.teacherIndate = teacherIndate;
    }

    public String getTeacherDuty() {
        return teacherDuty;
    }

    public void setTeacherDuty(String teacherDuty) {
        this.teacherDuty = teacherDuty;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }
}


