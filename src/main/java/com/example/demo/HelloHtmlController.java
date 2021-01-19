package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/")
public class HelloHtmlController {
    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }
}
