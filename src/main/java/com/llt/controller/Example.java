package com.llt.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author llt
 * @Date 2023-11-27-13:02
 **/
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home() {
        return "Hello world!";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "我要好好学习Java后端开发，精通SpringBoot框架！";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
