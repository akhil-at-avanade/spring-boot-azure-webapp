package com.avanade.akhilshelly.springbootazureapp.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("main")
public class MainController {

    @GetMapping(path = "hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> hello() {
        return ResponseEntity.ok(Map.of("status", "hello world"));
    }
}
