package org.example;

import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test
    public void testGuessTooLowReturnsHigher() {
        NumberGuesser game = new NumberGuesser(10);

        Assert.assertEquals("higher", game.guess(5));
    }

    @Test
    public void testGuessTooHighReturnsLower() {
        NumberGuesser game = new NumberGuesser(10);

        Assert.assertEquals("lower", game.guess(12));
    }

    @Test
    public void testGuessCorrectNumberReturnsCorrect() {
        NumberGuesser game = new NumberGuesser(10);

        Assert.assertEquals("Correct!", game.guess(10));
    }
}
