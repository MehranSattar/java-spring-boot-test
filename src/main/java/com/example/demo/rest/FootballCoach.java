package com.example.demo.rest;
import org.springframework.stereotype.Component;
@Component
public class FootballCoach implements Coach {
    @Override
    public String getInfo() {
        return "I'm a football coach for Arsenal FC";
    }
}
