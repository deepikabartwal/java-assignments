package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void shouldReturnMinusOneForNegativeRadiusInput() {
       double area = AreaCalculator.area(-5);
        assertEquals(-1, area);
    }

    @Test
    void shouldGiveAreaForValidInput() {
        double area = AreaCalculator.area( 5);
        assertEquals(78.53981633974483, area);
    }

    @Test
    void shouldReturnMinusOneforNegativeLengthValue() {
        double area = AreaCalculator.area( -5,5);
        assertEquals(-1,area);
    }
    @Test
    void shouldReturnMinusOneforNegativeBreadthValue() {
        double area = AreaCalculator.area( 5,-5);
        assertEquals(-1,area);
    }

    @Test
    void shouldAreaOfGivenValidInput() {
        double area = AreaCalculator.area( 5,5);
        assertEquals(25,area);
    }
}