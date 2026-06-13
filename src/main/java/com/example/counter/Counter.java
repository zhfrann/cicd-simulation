package com.example.counter;

public class Counter {
    private int count;

    public Counter() {
        reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void increaseBy(int value) {
        count += value;
    }

    public void decrement() {
        count--;
    }

    public void decreaseBy(int value) {
        count -= value;
    }

    public void multiplyBy(int value) {
        count = count * value;
    }

    public void triple() {
        multiplyBy(3);
    }

    public boolean isCountEven() {
        return count % 2 == 0;
    }

    public int getCount() {
        return count;
    }
}
