package com.foodtrackerbe.foodtrackerbe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @RequestMapping("/")
    public String greeting() {
        return "Greetings Oct 2020!";
    }
}
