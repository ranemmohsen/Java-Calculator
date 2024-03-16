package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains unit tests for the Calculator class.
 * The tests cover basic arithmetic operations: addition, subtraction, multiplication, and division.
 * Each test case is designed to verify the correctness of the Calculator's implementation.
 */
class CalculatorTest {
    private static final double EXPECTED_ADD_RESULT =   5;
    private static final double EXPECTED_SUBTRACT_RESULT =   1;
    private static final double EXPECTED_MULTIPLY_RESULT =   6;
    private static final double EXPECTED_DIVIDE_RESULT =   2;

    // Define constants for magic numbers
    private static final double NUMBER_2 =   2;
    private static final double NUMBER_3 =   3;
    private static final double NUMBER_6 =   6;
    private static final double NUMBER_0 =   0;

    private final Calculator calculator = new Calculator();

    /**
     * Tests the addition functionality of the Calculator.
     * Assumes that the Calculator correctly adds two positive numbers.
     */
    @Test
    void testAdd() {
        assertEquals(EXPECTED_ADD_RESULT, calculator.add(new double[]{NUMBER_2, NUMBER_3}),
                     "2 +   3 should equal   5");
    }

    /**
     * Tests the subtraction functionality of the Calculator.
     * Assumes that the Calculator correctly subtracts a smaller number from a larger one.
     */
    @Test
    void testSubtract() {
        assertEquals(EXPECTED_SUBTRACT_RESULT, calculator.subtract(new double[]{NUMBER_3, NUMBER_2}),
                     "3 -   2 should equal   1");
    }

    /**
     * Tests the multiplication functionality of the Calculator.
     * Assumes that the Calculator correctly multiplies two positive numbers.
     */
    @Test
    void testMultiply() {
        assertEquals(EXPECTED_MULTIPLY_RESULT, calculator.multiply(new double[]{NUMBER_2, NUMBER_3}),
                     "2 *   3 should equal   6");
    }

    /**
     * Tests the division functionality of the Calculator.
     * Assumes that the Calculator correctly divides a larger number by a smaller one.
     */
    @Test
    void testDivide() {
        assertEquals(EXPECTED_DIVIDE_RESULT, calculator.divide(new double[]{NUMBER_6, NUMBER_3}),
                     "6 /   3 should equal   2");
    }

    /**
     * Tests the Calculator's handling of division by zero.
     * Assumes that the Calculator throws an IllegalArgumentException when attempting to divide by zero.
     */
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(new double[]{NUMBER_6, NUMBER_0}),
                     "Division by zero should throw an exception");
    }
}
