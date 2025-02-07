package com.pofo.controller.TechStack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TechStack")
public class TechStackController {
    @GetMapping("")

}


package com.pofo.controller;

@RestController  // ✅ @Controller → @RestController 변경
@RequestMapping("/home")
public class HelloController {

    @GetMapping("/message")
    public String getGreeting() {
        return "Hello, Client!";
    }
}