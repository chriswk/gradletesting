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
}