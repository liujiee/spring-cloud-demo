package com.jie.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {


    private RestTemplate restTemplate;

    private final String POWPER = "http://POWER/powers";

    @Value("${spring.profiles}")
    private String profiles;

    @GetMapping("/{userId}")
    public String getUser(@PathVariable String userId) {
        return "get user message, profile = " + profiles
                + "and invoke Power message : "
                + restTemplate.getForObject(POWPER, String.class);
    }


    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
