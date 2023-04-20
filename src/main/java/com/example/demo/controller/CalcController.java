package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/calc")
    public String calc(String param1, String param2, String param3) {
        String ops = "plus minus multi divide";
        String result = "";
        if (!ops.contains(param3)) result = "Operation Error!";
        switch (param3) {
            case "plus": result = Double.toString(Double.parseDouble(param1) + Double.parseDouble(param2)); return (result);
            case "minus": result = Double.toString(Double.parseDouble(param1) - Double.parseDouble(param2));return (result);
            case "multi": result = Double.toString(Double.parseDouble(param1) * Double.parseDouble(param2));return (result);
            case "divide": result = (Double.parseDouble(param2) == 0 ? "Error! Division by zero" : Double.toString(Double.parseDouble(param1) / Double.parseDouble(param2)));return (result);
        }
        return result;
    }
}
