package com.example.TaskManager.controller;

import com.example.TaskManager.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    @Operation(summary = "Get a greeting message")
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return mathService.add(a, b);
    }

    @Operation(summary = "Get a personalized greeting")
    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return mathService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return mathService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        return mathService.divide(a, b);
    }
}