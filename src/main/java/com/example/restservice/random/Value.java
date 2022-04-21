package com.example.restservice.random;

public class Value {
    private final long id;
    private final String quote;

    public Value(long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public long getId() {
        return id;
    }

    public String getQuote() {
        return "Default quote 'success' or user defined. Result is " + quote;
    }
}
