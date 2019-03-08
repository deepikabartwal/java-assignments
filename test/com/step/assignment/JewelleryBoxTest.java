package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelleryBoxTest {

    @Test
    void shouldReturnFalseIfDoesNotHaveAnyJewellery() {
        JewelleryBox newBox = new JewelleryBox();
        assertEquals(false,newBox.hasJewellery());
    }

    @Test
    void shouldReturnFalseIfHasOnlyJewelleryBox() {
        JewelleryBox otherBox = new JewelleryBox();
        JewelleryBox newBox = new JewelleryBox(otherBox);
        assertEquals(false,newBox.hasJewellery());
    }

    @Test
    void shouldReturnTrueIfHasJewelleryBox() {
        Jewellery bangles = new Jewellery("bangles","gold",5);
        JewelleryBox newBox = new JewelleryBox(bangles);
        assertEquals(true,newBox.hasJewellery());

    }

    @Test
    void shouldReturnTrueIfHasJewelleryAndBox() {
        Jewellery bangles = new Jewellery("bangles","gold",5);
        JewelleryBox otherBox = new JewelleryBox();
        JewelleryBox newBox = new JewelleryBox(otherBox,bangles);
        assertEquals(true,newBox.hasJewellery());
    }


    @Test
    void hasJewelleryBoxShouldReturnFalseForNoBox() {
        JewelleryBox newBox = new JewelleryBox();
        assertEquals(false,newBox.hasJewelleryBox());
    }
    @Test
    void hasJewelleryBoxShouldReturnFalseForNoBoxButAJewellery() {
        Jewellery bangles = new Jewellery("bangles","gold",5);
        JewelleryBox newBox = new JewelleryBox(bangles);
        assertEquals(false,newBox.hasJewelleryBox());
    }
    @Test
    void getTotalJewelleryCount() {
        JewelleryBox _5thLevelBox = new JewelleryBox();

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery necklace = new Jewellery("necklace","gold",5);
        JewelleryBox _3rdLevelBox = new JewelleryBox( _4thLevelBox,necklace);

        Jewellery ring = new Jewellery("ring","gold",5);
        JewelleryBox _2ndLevelBox = new JewelleryBox(_3rdLevelBox,ring);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getTotalJewelleryCount());
    }
}