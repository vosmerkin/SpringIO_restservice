package com.example.restservice.config;

import com.example.restservice.greeting.GreetManagerCongrat;
import com.example.restservice.greeting.GreetManager;
import com.example.restservice.greeting.GreetManagerImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetConfig {
    @ConditionalOnProperty(name = "spring.greeting.manager",
            havingValue = "default",
            matchIfMissing = true)
    @Bean
    public GreetManager greetManagerImpl() {
        return new GreetManagerImpl();
    }

    @ConditionalOnProperty(name = "spring.greeting.manager", havingValue = "greeting")
    @Bean
    public GreetManager greetManagerCongrat() {
        return new GreetManagerCongrat();
    }
}
