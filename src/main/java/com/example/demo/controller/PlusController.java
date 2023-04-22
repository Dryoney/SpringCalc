package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PlusController {
    @GetMapping("/plus")
    public String calc(@RequestParam(value = "param1") String param1, @RequestParam(value = "param2") String param2)
    {
        return Double.toString(Double.parseDouble(param1) + Double.parseDouble(param2));
    }
}
