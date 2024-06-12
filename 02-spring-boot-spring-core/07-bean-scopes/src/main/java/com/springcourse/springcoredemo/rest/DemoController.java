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

    private Coach anotherCoach;

    // Constructor
    // @Autowired annotation means we can give any method name here and Spring will use it for setter dependency injection
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach,
                               @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
        public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // Check to see if this is the same bean
    // True or False depending on the bean scope
    // Singleton: true / Prototype: false
    @GetMapping("/check")
        public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
