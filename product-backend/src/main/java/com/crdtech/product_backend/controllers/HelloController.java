package com.crdtech.product_backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String getHello(){

        return "Olá, pecadores.";
        
    }

}

