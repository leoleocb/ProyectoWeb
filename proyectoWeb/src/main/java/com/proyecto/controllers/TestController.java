package com.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String testLoginTemplate() {
        return "login"; // Spring intentará cargar templates/login.html
    }
}
