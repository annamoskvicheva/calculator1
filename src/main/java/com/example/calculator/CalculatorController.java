package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

//
@RequestMapping("/calculator")


public class CalculatorController {

    private CalculatorService calculatorService = new CalculatorService();

    @GetMapping
    public String greeting() {

        CalculatorService calculatorService = new CalculatorService();

        return calculatorService.greeting();
    }


    @GetMapping("/plus")
        public  String plus (@RequestParam int num1, @RequestParam int num2){
        CalculatorService calculatorService = new CalculatorService();

            return calculatorService.plus(num1,num2);
    }
    @GetMapping("/minus")
    public String minus( @RequestParam int num1,  @RequestParam int num2) {
        CalculatorService calculatorService = new CalculatorService();

        return calculatorService.minus(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")

    public String divide( @RequestParam int num1, @RequestParam int num2) {
        CalculatorService calculatorService = new CalculatorService();
        return calculatorService.divide(num1,num2);
    }
}




