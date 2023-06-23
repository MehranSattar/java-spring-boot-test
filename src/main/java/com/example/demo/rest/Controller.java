package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private Coach myCoach;
    @Autowired
    public Controller(Coach the_coach) {
        myCoach = the_coach;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping("/coach")
    public String coach(){
        return myCoach.getInfo();
    }

}
