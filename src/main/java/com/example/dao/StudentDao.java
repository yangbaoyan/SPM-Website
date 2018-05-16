package com.example.dao;

import com.example.entity.Student;
import com.jeff.tianti.common.dao.CommonDao;

/**
 * @author liu
 * @desc StudentDao接口 
 * @date 2018-05-16
 */
public interface StudentDao extends StudentDaoCustom,CommonDao<Student,String>{

}