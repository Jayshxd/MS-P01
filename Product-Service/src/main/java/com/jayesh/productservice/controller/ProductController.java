package com.jayesh.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private Environment environment;

    @GetMapping("/test")
    public String get() {
        String port = environment.getProperty("server.port");
        return "Your order IPHUNEEEEEEEE is placed"+" *** this server running on port -> "+port;
    }
}
