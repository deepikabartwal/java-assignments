package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInWordTest {

    @Test
    void shouldReturnZeroForZero() {
        String output = NumberInWord.convertNumberInWord(0);
        assertEquals("Zero",output);
    }

    @Test
    void shouldReturnOneForOne() {
        String output = NumberInWord.convertNumberInWord(1);
        assertEquals("One",output);
    }

    @Test
    void shouldReturnTwoForTwo() {
        String output = NumberInWord.convertNumberInWord(2);
        assertEquals("Two",output);
    }
    @Test
    void shouldReturnThreeForThree() {
        String output = NumberInWord.convertNumberInWord(3);
        assertEquals("Three",output);
    }

    @Test
    void shouldReturnFourForFour() {
        String output = NumberInWord.convertNumberInWord(4);
        assertEquals("Four",output);
    }

    @Test
    void shouldReturnFiveForFive() {
        String output = NumberInWord.convertNumberInWord(5);
        assertEquals("Five",output);
    }

    @Test
    void shouldReturnSixForSix() {
        String output = NumberInWord.convertNumberInWord(6);
        assertEquals("Six",output);
    }

    @Test
    void shouldReturnSevenForSeven() {
        String output = NumberInWord.convertNumberInWord(7);
        assertEquals("Seven",output);
    }

    @Test
    void shouldReturnEightForEight() {
        String output = NumberInWord.convertNumberInWord(8);
        assertEquals("Eight",output);
    }

    @Test
    void shouldReturnNineForNine() {
        String output = NumberInWord.convertNumberInWord(9);
        assertEquals("Nine",output);
    }

    @Test
    void shouldReturnOtherForAnyOtherNumber() {
        String output = NumberInWord.convertNumberInWord(10);
        assertEquals("Other",output);
    }
}