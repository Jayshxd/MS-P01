package com.jayesh.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {


    @Autowired
    private ProductAPI productAPI;


    @GetMapping("/test")
    public ResponseEntity<String> get() {
        String s1 = "Welcome *****";
        String s2 = String.valueOf(productAPI.get());
        return ResponseEntity.ok().body(s1+" "+s2);

    }


}
