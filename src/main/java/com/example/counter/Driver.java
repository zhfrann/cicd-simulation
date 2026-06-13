package com.example.counter;

public class Driver {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increaseBy(4);
        counter.triple();
        counter.increaseBy(8);
    }
}
