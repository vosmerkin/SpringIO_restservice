package com.example.restservice.config;

import com.example.restservice.greeting.GreetCongratManager;
import com.example.restservice.greeting.GreetManager;
import com.example.restservice.greeting.GreetManagerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetConfig {
    @Bean
    public GreetManager greetManager(){
        return new GreetManagerImpl();
    }
    @Primary
    @Bean
    public GreetManager greetCongratManager(){
        return new GreetCongratManager();
    }
}
