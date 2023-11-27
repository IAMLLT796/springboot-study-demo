package com.llt.springbootstudydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration @EnableAutoConfiguration @ Configuration
public class SpringbootStudyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyDemoApplication.class, args);
    }

}
