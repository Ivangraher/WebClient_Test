package com.example.ms_config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class CommunicationController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/communicate/{name}")
    public String communicate(@PathVariable String name) {

        /*Communicate with the ms-webclient1*/
        String greeting = webClientBuilder.build()
                .get()
                .uri("http://localhost:5001/greet/" + name)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        /*Communicate with the ms-webclient2*/
        String farewell = webClientBuilder.build()
                .get()
                .uri("http://localhost:5002/farewell/" + name)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return greeting + " " + farewell;
    }
}
