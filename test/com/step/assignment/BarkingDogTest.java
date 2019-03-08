package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void shouldNotWakeUpIfDogIsNotBarking() {
        boolean hasWokeUp = BarkingDog.shouldWakeUp(false,6);
        assertEquals(false,hasWokeUp);
    }
}