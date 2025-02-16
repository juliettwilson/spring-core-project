package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Teabag {
    public Teabag() {
        System.out.println("Чайный пакетик готов");
    }
    public String toString() {
        return "черный чай";
    }
}
