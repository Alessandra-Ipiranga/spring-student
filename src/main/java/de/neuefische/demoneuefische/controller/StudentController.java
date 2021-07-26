package de.neuefische.demoneuefische.controller;

import org.springframework.web.bind.annotation.RequestParam;

public class StudentController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
