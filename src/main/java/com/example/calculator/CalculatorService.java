package com.example.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.geom.Arc2D;

@Service
@RequestMapping
public class CalculatorService {
    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+"+num2 + "=" + result ;
    }



    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }


    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }


    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}

