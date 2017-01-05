package com.wenyu.mybatis.service;

import com.wenyu.mybatis.bean.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by dayu on 2017/1/5.
 */
public interface StudentService {
    Student load(int i);

    List<Student> query(Map<String, Object> map);
}
