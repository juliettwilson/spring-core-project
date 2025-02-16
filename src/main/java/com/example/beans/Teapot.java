package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Teapot {
    private final Cup cup;

    public Teapot(Cup cup) {
        this.cup = cup;
        System.out.println("Чайник заварил чай!");
    }

    public void serveTea() {
        System.out.println("Подан: " + cup);
    }
}
