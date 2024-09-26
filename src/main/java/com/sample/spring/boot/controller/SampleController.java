package com.sample.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {
        @GetMapping("/getData")
        public ResponseEntity<String> getData(){
            String strVal = "Welcome to Spring Boot Application in Webhosting";
            return ResponseEntity.ok(strVal);
        }
}
