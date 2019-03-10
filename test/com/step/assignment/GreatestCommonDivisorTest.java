package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisorFiveAsResult() {
        int gcd = GreatestCommonDivisor.getGreatestCommonDivisor(25,15);
        assertEquals(5,gcd);
    }

    @Test
    void shouldREeturnMinusOneForAnyOfInputSmallerThan10() {
        int gcd = GreatestCommonDivisor.getGreatestCommonDivisor(8,15);
        assertEquals(-1,gcd);
    }

    @Test
    void shouldReturnOneForNoCommonDivisorInTwoNumbers() {
        int gcd = GreatestCommonDivisor.getGreatestCommonDivisor(32,15);
        assertEquals(1,gcd);
    }
}