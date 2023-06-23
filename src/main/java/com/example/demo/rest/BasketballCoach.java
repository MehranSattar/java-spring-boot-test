package com.example.demo.rest;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getInfo() {
        return "I'm a basketball coach for the Miami Heat";
    }
}
