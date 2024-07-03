package com.example.ms_webclient1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        log.info("Name :{}", name);
        return "Hi, " + name + "!";
    }
}
