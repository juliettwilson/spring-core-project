package com.example.beans;

import org.springframework.stereotype.Component;
@Component
public class Water {
    public Water() {
        System.out.println("Вода налита в чайник");
    }
    public String toString() {
        return "горячая вода";
    }
}
