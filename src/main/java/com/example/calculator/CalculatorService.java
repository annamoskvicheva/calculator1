package com.example.calculator;

import org.springframework.stereotype.Service;


import java.awt.geom.Arc2D;

@Service

public class CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;

        return num1+"+"+ num2+"="+ result ;
    }



    public String minus(int num1, int num2) {
        int result = num1 - num2;

        return num1+"-"+ num2+"="+ result;
    }


    public String multiply(int num1, int num2) {
        int result =  num1 * num2;
        return num1+"*"+ num2+"="+ result;
    }


    public String divide(int num1, int num2) {
        int result= num1/num2;
        return  num1+"/"+ num2+"="+ result;
    }
}

