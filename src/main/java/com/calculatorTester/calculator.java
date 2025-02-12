package com.calculatorTester;
public class calculator {
    // Add function for multiple integers
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Multiply function for multiple integers
    public int multiply(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }
}
