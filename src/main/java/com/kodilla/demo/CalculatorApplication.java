package com.kodilla.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultOfAddition = calculator.addition(5, 15);
        System.out.println(resultOfAddition);

        int resultOfSubtraction = calculator.subtraction(500, 499);


    }
}
