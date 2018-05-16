package com.example.entity;


import com.jeff.tianti.common.entity.BaseEntity;

import javax.persistence.*;

/***********************************************************************
 * Module:  Student.java
 * Author:  Administrator
 * Purpose: Defines the Class Student
 ***********************************************************************/

@Entity
@Table(name = "student")
public class Student extends BaseEntity{
    private String studentIndate;
    private UserInfo userInfo;

    @Column(name = "student_indate")
    public String getStudentIndate() {
        return studentIndate;
    }

    public void setStudentIndate(String studentIndate) {
        this.studentIndate = studentIndate;
    }

    @OneToOne
    @JoinColumn(name = "userinfo_id")
    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}