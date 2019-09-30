package com.qf.controller;

import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tea")
public class TeacherController {

    @Autowired
    private IStuService stuService;

    /**
     * 查询老师的所有的学生
     * @return
     */
    @RequestMapping("/queryTeacherStudent")
    @ResponseBody
    public String queryTeacherStudent(){
        System.out.println("调用了教师的微服务");

        //调用学生微服务，查询所有学生信息
        String result = stuService.list();

        return "result:" + result;
    }
}
