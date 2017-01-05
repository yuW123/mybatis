package com.wenyu.mybatis.service.impl;

import com.wenyu.mybatis.bean.Student;
import com.wenyu.mybatis.dao.StudentDao;
import com.wenyu.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dayu on 2017/1/5.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public Student query(int i) {
        return studentDao.loadStudentById(i);
    }
}
