package com.example.TaskManager.controller;

import com.example.TaskManager.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/strings")
public class StringController {

    @Autowired
    private StringService stringService;

    @GetMapping("/reverse")
    public String reverse(@RequestParam String input) {
        return stringService.reverse(input);
    }

    @GetMapping("/countVowels")
    public long countVowels(@RequestParam String input) {
        return stringService.countVowels(input);
    }

    @GetMapping("/countConsonants")
    public long countConsonants(@RequestParam String input) {
        return stringService.countConsonants(input);
    }

    @GetMapping("/convertCase")
    public String convertCase(@RequestParam String input) {
        return stringService.convertCase(input);
    }
}