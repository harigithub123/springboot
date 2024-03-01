package com.collegeadmision.springbootapp.hari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MathController {

    @GetMapping(path = "/calculator/{function}/{number}")
    public int getCountries(@PathVariable("function") String function, @PathVariable("number") int number) {
        if(function.equals("square")) {
            return square(number);
        }
        if(function.equals("factorial")) {
            return fact(number);
        }
        return -1;
    }

    private int fact(int number) {
        if(number < 1) {
            return -1;
        }
        return number == 1? 1 : number * fact(number-1);
    }

    private int square(int number) {
        return 0;
    }

}
