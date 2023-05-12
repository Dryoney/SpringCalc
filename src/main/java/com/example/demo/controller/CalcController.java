package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalcController {

    @GetMapping("/calc/{param1}/{param2}/{param3}")
    public String calc(@PathVariable(value = "param1") String param1, @PathVariable(value = "param2") String param2, @PathVariable(value = "param3") String param3) {
        String res = null;
        boolean finished = false;
        String ops = "plus minus multi divide";
        String result = "";
        if (!ops.contains(param3)) {
            result = "Operation Error!";
        }
        switch (param3) {
            case "plus":
                result = Double.toString(Double.parseDouble(param1) + Double.parseDouble(param2));
                res = (result);
                finished = true;
                break;
            case "minus":
                result = Double.toString(Double.parseDouble(param1) - Double.parseDouble(param2));
                res = (result);
                finished = true;
                break;
            case "multi":
                result = Double.toString(Double.parseDouble(param1) * Double.parseDouble(param2));
                res = (result);
                finished = true;
                break;
            case "divide":
                result = (Double.parseDouble(param2) == 0 ? "Error! Division by zero" : Double.toString(Double.parseDouble(param1) / Double.parseDouble(param2)));
                res = (result);
                finished = true;
                break;
        }
        if (!finished) {
            res = result;
        }
        return res;
    }

    @GetMapping("/calc1")
    public String calc1(String param1, String param2, String param3) {
        return switch (param3) {
            case "plus" -> Double.toString(Double.parseDouble(param1) + Double.parseDouble(param2));
            case "minus" -> Double.toString(Double.parseDouble(param1) - Double.parseDouble(param2));
            case "multi" -> Double.toString(Double.parseDouble(param1) * Double.parseDouble(param2));
            case "divide" ->
                    (Double.parseDouble(param2) == 0 ? "Error! Division by zero" : Double.toString(Double.parseDouble(param1) / Double.parseDouble(param2)));
            default -> "Operation Error!";
        };
    }
}
