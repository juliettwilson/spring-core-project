package com.example.config;

import com.example.beans.GreetingService;
import com.example.beans.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    @Bean
    public UserService userService(GreetingService greetingService) {
        return new UserService(greetingService);
    }
}
