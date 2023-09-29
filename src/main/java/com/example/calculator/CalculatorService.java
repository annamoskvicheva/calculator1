package com.example.calculator;

import org.springframework.stereotype.Service;


import java.awt.geom.Arc2D;

@Service

public class CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(int num1, int num2) {

        return num1 + num2;
    }



    public int minus(int num1, int num2) {

        return num1 - num2;
    }


    public int multiply(int num1, int num2) {

        return num1 *num2;
    }


    public int divide(int num1, int num2) {

        return  num1 / num2;
    }
}

