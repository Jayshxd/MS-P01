package com.jayesh.notificationservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductAPI {

    @GetMapping("products/test")
    public ResponseEntity<String> get();
}
