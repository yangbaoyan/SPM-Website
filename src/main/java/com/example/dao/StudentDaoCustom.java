package com.example.dao;

import com.jeff.tianti.common.entity.PageModel;
import java.util.List;
import com.example.entity.Student;
import com.example.dto.StudentQueryDTO;
/**
 * @author liu
 * @desc StudentDaoCustom接口 
 * @date 2018-05-16
 */
public interface StudentDaoCustom {

      PageModel<Student> queryStudentPage(StudentQueryDTO studentQueryDTO);

      List<Student> queryStudentList(StudentQueryDTO studentQueryDTO);



}