package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DivideController {
    @GetMapping("/divide")
    public String calc(@RequestParam(value = "param1") String param1, @RequestParam(value = "param2") String param2)
    {
        return (Double.parseDouble(param2) == 0 ? "Error! Division by zero" : Double.toString(Double.parseDouble(param1) / Double.parseDouble(param2)));
    }
}