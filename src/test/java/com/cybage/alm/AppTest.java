package com.cybage.alm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSum() {
        // Given
        App calculator = new App();
        
        // When
        int result = calculator.sum(2, 2);
        
        // Then
        // Correcting expected value to 4 (2 + 2 = 4)
        assertEquals("Sum of 2 and 2 should be 4", 4, result);
    }

    @Test
    public void testMinus() {
        // Given
        App calculator = new App();
        
        // When & Then
        assertEquals("2 - 2 should be 0", 0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        // Given
        App calculator = new App();
        
        // When & Then
        assertEquals("6 / 3 should be 2", 2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        // Given
        App calculator = new App();
        
        // When
        calculator.divide(6, 0); // This should throw ArithmeticException
    }

    @Test
    public void testMultiply() {
        // Given
        App calculator = new App();
        
        // Test cases with expected results
        assertEquals("2 * 3 should be 6", 6, calculator.multiply(2, 3));  // 2 * 3 = 6
        assertEquals("-2 * 3 should be -6", -6, calculator.multiply(-2, 3)); // -2 * 3 = -6
        assertEquals("0 * 5 should be 0", 0, calculator.multiply(0, 5));  // 0 * 5 = 0
        assertEquals("3 * 3 should be 9", 9, calculator.multiply(3, 3));  // 3 * 3 = 9
    }
}