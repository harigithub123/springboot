package com.collegeadmision.springbootapp.hari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CountryController {

    @GetMapping(path = "ListofCountriesInTheWorld")
    public List<String> getCountries() {
        return Arrays.asList("India", "USA","Pakistan");
    }

}
