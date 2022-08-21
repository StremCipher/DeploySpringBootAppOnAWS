package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfiguration {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("")
    public String index() {
        return "welcome to index page aws";
    }
}
