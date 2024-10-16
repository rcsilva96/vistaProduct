package com.crdtech.product_backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyControler {

    @GetMapping("products/888")
    public String getLucky(){
        return "Parabéns, você encontrou a página secreta! 888 anos de sorte para você!";
    }
}
