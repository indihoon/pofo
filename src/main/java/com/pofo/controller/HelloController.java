package com.pofo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/home")
public class HelloController {
    @GetMapping("/message")
    public String getGreeting() {
        return "Hello, Client!";
    }
}
