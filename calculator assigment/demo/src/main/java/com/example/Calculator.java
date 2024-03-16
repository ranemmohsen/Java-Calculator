package com.example;

public class Calculator {

    public double add(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double subtract(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double multiply(double[] numbers) {
        double product = 1;
        for (double number : numbers) {
            product *= number;
        }
        return product;
    }

    public double divide(double[] numbers) {
        if (numbers[1] == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result /= numbers[i];
        }
        return result;
    }
}