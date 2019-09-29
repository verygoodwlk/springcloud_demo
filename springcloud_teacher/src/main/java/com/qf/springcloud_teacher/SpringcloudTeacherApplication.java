package com.qf.springcloud_teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qf")
public class SpringcloudTeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTeacherApplication.class, args);
    }

}
