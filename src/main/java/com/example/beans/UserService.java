package com.example.beans;

public class UserService {
    private final GreetingService greetingService;

    public UserService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void printGreeting() {
        System.out.println(greetingService.getGreeting());
    }
}
