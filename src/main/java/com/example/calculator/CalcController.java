package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CalcController {

    @GetMapping
    public String val(){
        return "hy welcome to calculator application...";
    }
}
