package com.example.restservice.random;

import com.example.restservice.greeting.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RandomController {


    private final AtomicLong counter = new AtomicLong();
    private Value value;


    @GetMapping("/random")
    public Random random(@RequestParam(value = "successORfault", defaultValue = "success") String typeOfResult) {
        return new Random(typeOfResult, new Value(counter.incrementAndGet(), typeOfResult));
    }
}