package com.wenyu.mybatis.service.impl;

import com.wenyu.mybatis.bean.Student;
import com.wenyu.mybatis.dao.StudentDao;
import com.wenyu.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by dayu on 2017/1/5.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public Student load(int i) {
        return studentDao.loadStudentById(i);
    }

    public List<Student> query(Map<String, Object> map) {
        List<Student> students = studentDao.queryStudent(map);
        return students;
    }
}
