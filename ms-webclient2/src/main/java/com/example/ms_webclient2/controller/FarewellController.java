package com.example.ms_webclient2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarewellController {

    private static final Logger log = LoggerFactory.getLogger(FarewellController.class);

    @GetMapping("/farewell/{name}")
    public String farewell(@PathVariable String name){
        log.info("Name :{}", name);
        return "Goodbye, " + name + "!";
    }
}
