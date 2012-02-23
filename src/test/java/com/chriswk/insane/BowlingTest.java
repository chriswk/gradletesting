package com.chriswk.insane;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class BowlingTest {
    Bowling b;

    @Before
    public void setUp() {
        b = new Bowling();
    }

    @Test
    public void shouldScoreEmptyGameAsZero() {
        assertEquals(0, b.score());
    }

    @Test
    public void shouldScoreAllOnesAsTwenty() {
        for(int i = 0; i<20;i++) {
            b.roll(1);
        }
        assertEquals(20, b.score());
    }

    @Test
    public void shouldScoreAllFivesAsHundredAndFifty() {
        for(int i = 0; i<21; i++) {
            b.roll(5);
        }
        assertEquals(150, b.score());
    }

    @Test
    public void shouldScoreAllStrikesAsThreeHundred() {
        for(int i = 0; i<12; i++) {
            b.roll(10);
        }
        assertEquals(300, b.score());
    }

    @Test
    public void shouldScoreDutchGameSpareStrikeAsTwoHundred() {
        for(int i = 0; i<5; i++) {
            b.roll(5);
            b.roll(5);
            b.roll(10);
        }
        b.roll(5);
        b.roll(5);
        assertEquals(200, b.score());
    }

    @Test
    public void shouldScoreDutchGameStrikeSpareAsTwoHundred() {
        for(int i = 0; i<5; i++) {
            b.roll(10);
            b.roll(5);
            b.roll(5);
        }
        b.roll(10);
        assertEquals(200, b.score());
    }
}