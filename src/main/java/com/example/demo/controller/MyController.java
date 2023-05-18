package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {


    @RequestMapping("/test")
    public String test() throws Exception{

        throw new NullPointerException("TestController have exception");

    }
}
