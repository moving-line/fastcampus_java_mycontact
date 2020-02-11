package com.fastcampus.javaallinone.project3.mycontact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/helloWorld")
    public String helloWorld() {
        return "HelloWorld";
    }

    @GetMapping("/api/helloException")
    public String helloException() {
        throw new RuntimeException("Hello RuntimeException");
    }
}
