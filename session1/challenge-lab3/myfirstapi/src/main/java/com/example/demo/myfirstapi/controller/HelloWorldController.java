package com.example.demo.myfirstapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map; // <-- Import this!
import java.util.HashMap; // <-- Import this!

@RestController
public class HelloWorldController {


    @GetMapping("/info")
    public Map<String, String> getAppInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("appName", "MyFirstSpringBootAPI");
        info.put("version", "1.0.0");
        info.put("status", "Running");
        return info;
    }

    @GetMapping("/features")
    public List<String> getFeatures() {
        return Arrays.asList("REST API", "Spring Boot", "Easy Setup", "Fast Development");
    }
}