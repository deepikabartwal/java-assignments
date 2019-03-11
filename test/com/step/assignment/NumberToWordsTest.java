package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @Test
    void getDigitCountShouldReturnNumber() {
        int numberOfDigit = NumberToWords.getDigitCount(123);
        assertEquals(3,numberOfDigit);
    }

    @Test
    void shouldReturnMinusOneForNegativeNumber() {
        int numberOfDigit = NumberToWords.getDigitCount(-123);
        assertEquals(-1,numberOfDigit);
    }

    @Test
    void shouldReturnReverseOfGivenNumber() {
        int reversedNumber = NumberToWords.reverse(1234);
        assertEquals(4321,reversedNumber);
    }

    @Test
    void shouldReturnReverseOfGivenNegativeNumber() {
        int reversedNumber = NumberToWords.reverse(-1234);
        assertEquals(-4321,reversedNumber);
    }

    @Test
    void convertNumberInWord() {
        String numberInWord = NumberToWords.convertNumberInWord(1);
        assertEquals("One",numberInWord);
    }
    @Test
    void convertNumberInWordShouldReturnOther() {
        String numberInWord = NumberToWords.convertNumberInWord(11);
        assertEquals("Other",numberInWord);
    }

    @Test
    void numberToWords() {
        String numberToWords = NumberToWords.numberToWords(123);
        assertEquals("One Two Three",numberToWords);
    }
}