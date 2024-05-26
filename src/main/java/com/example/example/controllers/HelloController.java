package com.example.example.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@RestController()
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public String getHelloWorld() {
        return "hello world";
    }
    
    
}
