package com.example.calculatorfx.models;

public class Calculator {
    private float value;

    public Calculator() {
        this.value = 0;
    }

    public void reset() {
        this.value = 0;
    }

    public void add(float value) {
        this.value += value;
    }

    public void subtract(float value) {
        this.value -= value;
    }

    public void multiply(float value) {
        this.value *= value;
    }

    public void divide(float value) {
        this.value /= value;
    }

    public float getValue() {
        return this.value;
    }
}
