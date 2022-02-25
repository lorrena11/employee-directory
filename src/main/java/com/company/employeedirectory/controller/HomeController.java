package com.company.employeedirectory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // going to localhost:8080 returns this
    @GetMapping
    public String sayHello(){
        return "Welcome to home page";
    }
}
