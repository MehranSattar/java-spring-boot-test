package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private Coach footballCoach;
    private Coach basketballCoach;
    @Autowired
    public Controller(@Qualifier("footballCoach") Coach footballCoach, @Qualifier("basketballCoach") Coach basketballCoach) {

        this.footballCoach = footballCoach;
        this.basketballCoach = basketballCoach;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping("/football-coach")
    public String football_coach(){
        return footballCoach.getInfo();
    }
    @GetMapping("/basketball-coach")
    public String basketball_coach(){
        return basketballCoach.getInfo();
    }

}
