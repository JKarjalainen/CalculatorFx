package com.example.calculatorfx;

import com.example.calculatorfx.models.Calculator;

public class Main {
    public static void main(String[] args) {
        //HelloApplication.main(args);
        Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.add(2);
        System.out.println(calculator.getValue());
    }
}
