package com.qf.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "web-student", fallback = StuServiceFallBack.class)
public interface IStuService {

    @RequestMapping("/stu/list")
    String list();
}
