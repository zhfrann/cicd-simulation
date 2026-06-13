package com.example.counter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CounterTest {
    @Test
    public void resetShouldReturnCountToZero() {
        Counter counter = new Counter();
        counter.increaseBy(10);

        counter.reset();

        assertEquals(0, counter.getCount());
    }

    @Test
    public void incrementShouldIncreaseCountByOne() {
        Counter counter = new Counter();

        counter.increment();

        assertEquals(1, counter.getCount());
    }

    @Test
    public void decrementShouldDecreaseCountByOne() {
        Counter counter = new Counter();

        counter.decrement();

        assertEquals(-1, counter.getCount());
    }

    @Test
    public void increaseAndDecreaseShouldUpdateCount() {
        Counter counter = new Counter();

        counter.increaseBy(8);
        counter.decreaseBy(3);

        assertEquals(5, counter.getCount());
    }

    @Test
    public void tripleShouldMultiplyCountByThree() {
        Counter counter = new Counter();
        counter.increaseBy(4);

        counter.triple();

        assertEquals(12, counter.getCount());
    }

    @Test
    public void isCountEvenShouldReturnCorrectBoolean() {
        Counter counter = new Counter();
        assertTrue(counter.isCountEven());

        counter.increment();
        assertFalse(counter.isCountEven());
    }
}
