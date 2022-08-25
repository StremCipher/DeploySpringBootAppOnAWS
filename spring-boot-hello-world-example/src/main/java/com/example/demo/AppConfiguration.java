package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/html")
    public ModelAndView html() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

}
