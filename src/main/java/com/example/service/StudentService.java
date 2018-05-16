package com.example.service;

import com.example.entity.Student;
import com.example.dao.StudentDao;
import com.example.dto.StudentQueryDTO;
import com.jeff.tianti.common.service.CommonService;
import com.jeff.tianti.common.entity.PageModel;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author liu
 * @desc StudentService类 
 * @date 2018-05-16
 */
@Service
public class StudentService extends CommonService< Student,String >  {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao){
      super.setCommonDao(studentDao);
    }

    public PageModel<Student> queryStudentPage(StudentQueryDTO studentQueryDTO){
           return this.studentDao.queryStudentPage(studentQueryDTO);
    }

    public List<Student> queryStudentList(StudentQueryDTO studentQueryDTO){
           return this.studentDao.queryStudentList(studentQueryDTO);
    }


}