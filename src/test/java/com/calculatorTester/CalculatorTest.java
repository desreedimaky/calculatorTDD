package com.calculatorTester;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddTwoNumbers() {
        calculator calculator = new calculator();
        assertEquals(3, com.calculatorTester.calculator.add(1, 2));
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        calculator calculator = new calculator();
        assertEquals(-2, com.calculatorTester.calculator.add(-1, -1));
    }

    @Test
    public void testAddMultipleNumbers() {
        calculator calculator = new calculator();
        assertEquals(15, com.calculatorTester.calculator.add(1, 2, 3, 4, 5));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        calculator Calculator = new calculator();
        assertEquals(3, Calculator.multiply(1, 3));
    }

    @Test
    public void testMultiplyNegativeNumber() {
        calculator Calculator = new calculator();
        assertEquals(-3, Calculator.multiply(-1, 3));
    }

    @Test
    public void testMultiplyMultipleNumbers() {
        calculator Calculator = new calculator();
        assertEquals(120, Calculator.multiply(1, 2, 3, 4, 5));
    }
}
