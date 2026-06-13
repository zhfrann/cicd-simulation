package com.example.counter;

public class Driver {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increaseBy(4);
        counter.triple();
        counter.increaseBy(8);

        System.out.println("Counter value now: " + counter.getCount());
        System.out.println("Is counter even? " + counter.isCountEven());
    }
}
