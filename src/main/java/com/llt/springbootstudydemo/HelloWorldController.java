package com.llt.springbootstudydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author llt
 * @Date 2023-10-13-23:46
 **/
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello, SpringBoot World！";
    }
}
