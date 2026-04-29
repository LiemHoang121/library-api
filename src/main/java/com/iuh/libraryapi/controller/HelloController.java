package com.iuh.libraryapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Xin chao, Library API dang chay!";
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
                "projectName", "library-api",
                "version", "1.0.0",
                "status", "running",
                "author", "Liem"
        );
    }
}