package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public int sum(
           @RequestParam int a,
           @RequestParam int b){
        return a + b;
    }

    @RequestMapping("/mult")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b){
        return a * b;
        //test
    }

    @RequestMapping("/absolut")
    public int absolut(
            @RequestParam int a){
        return Math.abs(a);

    }

    @RequestMapping("/quadrat")
    public int quadrat(
            @RequestParam int a){
        return a * a;

    }

    @RequestMapping("/exp")
    public double exp(
            @RequestParam int a,
            @RequestParam int b){

        return Math.pow(a,b);

        /*for (int i = 1; i < b; i++){
            a *= a;
        }
        return a;*/
    }

    @RequestMapping("/sqrt")
    public double sqrt(
            @RequestParam int a){
        return Math.sqrt(a);
        //test
    }

// quadrieren, exponentiell
}
