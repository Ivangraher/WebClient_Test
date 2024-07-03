package com.example.ms_webclient1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submitName")
    public String submitName(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "redirect:http://localhost:5002/farewell/" + name;
    }
}
