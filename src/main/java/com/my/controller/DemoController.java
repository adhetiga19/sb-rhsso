package com.my.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class DemoController {
    @GetMapping()
    public ResponseEntity<?> get(){
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello world");
    }

    @GetMapping("/test")
    public ResponseEntity<?> getTest(){
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello world");
    }
}
