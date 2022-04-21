package com.example.restservice.random;

import java.util.concurrent.atomic.AtomicLong;

public class Random {
    private final String typeOfResult;
    private Value value;


    public Random(String typeOfResult, Value value) {
        this.typeOfResult = typeOfResult;
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public String getTypeOfResult() {
        return typeOfResult;
    }
}
