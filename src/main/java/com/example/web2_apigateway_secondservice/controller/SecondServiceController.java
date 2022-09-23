package com.example.web2_apigateway_secondservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SecondServiceController {

    @GetMapping("/second-service")
    public String welcome() {
        return "Welcome to the Second service";
    }
}
