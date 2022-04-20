package com.example.restservice.random;

import java.util.concurrent.atomic.AtomicLong;

public class Random {
    private Long counter;
    private final String typeOfResult;
    private Value value;


    public Random(String typeOfResult, Long counter) {
        this.typeOfResult = typeOfResult;
        this.counter = counter;
        value = new Value(counter, typeOfResult);
    }

    public Value getValue() {
        return value;
    }

    public String getTypeOfResult() {
        return typeOfResult;
    }
}
