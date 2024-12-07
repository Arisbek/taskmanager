package com.example.TaskManager.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public long countVowels(String input) {
        return input.chars().filter(c -> "AEIOUaeiou".indexOf(c) != -1).count();
    }

    public long countConsonants(String input) {
        return input.chars().filter(c -> "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(c) != -1).count();
    }

    public String convertCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}