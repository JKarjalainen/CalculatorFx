package com.example.calculatorfx;

import com.example.calculatorfx.models.Calculator;

public class CalcController {
    private Calculator calculator;

    public CalcController() {
        this.calculator = new Calculator();
    }

    public void add(float value) {
        this.calculator.add(value);
    }

    public void subtract(float value) {
        this.calculator.subtract(value);
    }

    public void multiply(float value) {
        this.calculator.multiply(value);
    }

    public void divide(float value) {
        this.calculator.divide(value);
    }

    public void reset() {
        this.calculator.reset();
    }

    public float getValue() {
        return this.calculator.getValue();
    }
}
