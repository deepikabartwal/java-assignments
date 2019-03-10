package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstANdLastDigitSumTest {

    @Test
    void shouldGiveFourAsSumFirstAndLastDigit() {
        int sum = FirstANdLastDigitSum.sumFirstAndLastDigit(252);
        assertEquals(4,sum);
    }

    @Test
    void shouldGiveMinusOneForNegativeValue() {
        int sum = FirstANdLastDigitSum.sumFirstAndLastDigit(-4);
        assertEquals(-1,sum);
    }
}