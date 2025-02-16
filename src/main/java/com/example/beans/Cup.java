package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Cup {
    private final Water water;
    private final Teabag teaBag;

    public Cup(Water water, Teabag teaBag) {
        this.water = water;
        this.teaBag = teaBag;
        System.out.println("Чашка с чаем приготовлена");
    }

    public String toString() {
        return "Чашка чая: " + water + " + " + teaBag;
    }
}

