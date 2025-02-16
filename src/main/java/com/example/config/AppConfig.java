package com.example.config;

import com.example.beans.Cup;
import com.example.beans.Water;
import com.example.beans.Teabag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.beans")
public class AppConfig {

    @Bean
    public Water water() {
        return new Water();
    }

    @Bean
    public Teabag teaBag() {
        return new Teabag();
    }

    @Bean
    public Cup cup(Water water, Teabag teaBag) {
        return new Cup(water, teaBag);
    }
}
