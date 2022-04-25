package com.example.restservice.config;

import com.example.restservice.greeting.GreetManagerCongrat;
import com.example.restservice.greeting.GreetManager;
import com.example.restservice.greeting.GreetManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetConfig {
    @Bean
    public GreetManager greetManagerImpl(){
        return new GreetManagerImpl();
    }
    @Bean
    public GreetManager greetManagerCongrat(){
        return new GreetManagerCongrat();
    }
}
