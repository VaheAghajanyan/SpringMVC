package com.synisys.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloController() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyeController() {
        return "first/goodbye";
    }
}
