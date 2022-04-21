package com.example.restservice.greeting;

import java.util.concurrent.atomic.AtomicLong;

public class GreetManagerImpl implements GreetManager {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    @Override
    public Greeting getGreeter(String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        System.out.println(this.getClass());
        return greeting;
    }
}
