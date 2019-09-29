package com.qf.service;

import org.springframework.stereotype.Component;

@Component
public class StuServiceFallBack implements IStuService {

    /**
     * list方法的降级方法
     * @return
     */
    @Override
    public String list() {
        return "骚瑞，服务异常，请扫后再试！";
    }
}
