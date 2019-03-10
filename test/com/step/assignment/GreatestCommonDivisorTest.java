package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisorFiveAsResult() {
        int gcd = GreatestCommonDivisor.getGreatestCommonDivisor(25,15);
        assertEquals(5,gcd);
    }
}