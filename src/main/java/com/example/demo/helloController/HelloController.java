package com.example.demo.helloController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){

        return "Hello, Spring Boot 2!";
    }

    @RequestMapping("/hi")
    public String handle02(){

        return "Hello, Spring Boot 3!";
    }
}
