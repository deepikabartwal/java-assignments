package com.step.assignment;

import com.step.assignment.NumberPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @Test
    void shouldReturnTrueWhenNumberIsPalindrome() {
        boolean isPalindrome = NumberPalindrome.isPalindrome(1234321);
        assertTrue(isPalindrome);
    }

    @Test
    void shouldReturnTrueForNegativeNumberPalindrome() {
        boolean isPalindrome = NumberPalindrome.isPalindrome(-1221);
        assertTrue(isPalindrome);
    }

    @Test
    void shoulReturnFalseWhenNumberIsNotPalindrome() {
        boolean isPalindrome = NumberPalindrome.isPalindrome(123432);
        assertFalse(isPalindrome);
    }
}