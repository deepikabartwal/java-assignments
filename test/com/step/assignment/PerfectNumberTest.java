package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void isPerfectNumberShouldGiveTrueForTwentyEight() {
        boolean isPerfectNumber =PerfectNumber.isPerfectNumber(28);
        assertTrue(isPerfectNumber);
    }

    @Test
    void shouldReturnFalseForNine() {
        boolean isPerfectNumber =PerfectNumber.isPerfectNumber(9);
        assertFalse(isPerfectNumber);
    }

    @Test
    void shouldReturnFalseForNegativeNumber() {
        boolean isPerfectNumber =PerfectNumber.isPerfectNumber(-1);
        assertFalse(isPerfectNumber);
    }
}