package com.example.dao;

import com.jeff.tianti.common.dao.CustomBaseSqlDaoImpl;
import com.jeff.tianti.common.entity.PageModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.entity.Student;
import com.example.dto.StudentQueryDTO;
/**
 * @author liu
 * @desc StudentDaoImpl类 
 * @date 2018-05-16
 */

public class StudentDaoImpl extends CustomBaseSqlDaoImpl implements StudentDaoCustom  {

    public PageModel<Student> queryStudentPage(StudentQueryDTO studentQueryDTO){
         Map<String,Object> map = new HashMap<String,Object>();
         StringBuilder hql = new StringBuilder();
         hql.append("select t from Student t ");
         return this.queryForPageWithParams(hql.toString(),map,studentQueryDTO.getCurrentPage(),studentQueryDTO.getPageSize());
    }

    public List<Student> queryStudentList(StudentQueryDTO studentQueryDTO){
         Map<String,Object> map = new HashMap<String,Object>();
         StringBuilder hql = new StringBuilder();
         hql.append("select t from Student t ");
         return this.queryByMapParams(hql.toString(),map);
    }



}