package com.qf.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServerApplication.class, args);
    }

}
