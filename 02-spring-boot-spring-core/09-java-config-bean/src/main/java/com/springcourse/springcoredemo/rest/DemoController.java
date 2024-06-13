package com.springcourse.springcoredemo.rest;

import com.springcourse.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;

    // Constructor
    // @Autowired annotation means we can give any method name here and Spring will use it for setter dependency injection
    @Autowired
    public void DemoController(
            @Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
        public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
