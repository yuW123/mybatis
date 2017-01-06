package com.wenyu.mybatis.controller;

import com.wenyu.mybatis.bean.Student;
import com.wenyu.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dayu on 2017/1/5.
 */
@RequestMapping("/test")
@RestController
public class TestMybatis {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/test1")
    Map<String, Object> queryStudent(@RequestBody Map<String, Object> map){
        List<Student> query = studentService.query(map);
        Map<String, Object> rlt = new HashMap<String, Object>();
        rlt.put("Param", map);
        rlt.put("Result", query);
        return rlt;
    }
}
