package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    public String greeting() {
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.greeting();
    }

        public  String plus (@RequestParam int num1, @RequestParam int num2){
            num1 = 5; // добавлено
            num2 = 5;
            CalculatorService calculatorService = new CalculatorService();
            return calculatorService.plus(num1,num2);
    }


    public String minus(@RequestParam int num1, @RequestParam int num2) {
        num1 = 5;
        num2 = 5;
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.minus(num1,num2);
    }


    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        num1 = 5;
        num2 = 5;
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.multiply(num1, num2);
    }


    public String divide(@RequestParam int num1, @RequestParam int num2) {
        num1 = 5;
        num2 = 5;
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.divide(num1,num2);
    }
}




