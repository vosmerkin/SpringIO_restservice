package com.example.restservice.greeting;

import java.util.concurrent.atomic.AtomicLong;

public class GreetManagerCongrat implements GreetManager {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    @Override
    public Greeting getGreeter(String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        System.out.println(this.getClass());
        if ("Anna".equals(name)) {
            greeting.setContent("Happy Birthday, Anna!!!");
        }
        return greeting;
    }
}
