package com.jie.power.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/powers")
public class PowerController {

    @Value("${spring.profiles}")
    private String profiles;

    @GetMapping
    public String getPower() {

        return "power message from power service, profiles = " + profiles;
    }
}
