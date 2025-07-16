package com.example.demo.myfirstapi.controller;

import org.springframework.beans.factory.annotation.Value; // <-- Import this!
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${app.greeting.message}") // Inject value from application.properties
    private String customGreeting;

    @GetMapping("/hello")
    public String sayHello() {
        return customGreeting; // Now returns the custom message
    }
}