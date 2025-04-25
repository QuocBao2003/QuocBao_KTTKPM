package com.example.demo.serviceA;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/service-a")
public class ServiceAController
{
    @GetMapping("/hello")
    public ResponseEntity<String> serviceA(){
        return ResponseEntity.ok("Hello from serviceA");
    }

}
