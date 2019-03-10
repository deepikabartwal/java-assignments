package com.step.assignment.masterChallenge;

import com.step.assignment.EvenDigitSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @Test
    void getEvenDigitSumForOneTonNine() {
        int sum = EvenDigitSum.getEvenDigitSum(123456789);
        assertEquals(20,sum);
    }

    @Test
    void shouldReturnMinusOneForNegativeNumbers() {
        int sum = EvenDigitSum.getEvenDigitSum(-1);
        assertEquals(-1,sum);
    }
}