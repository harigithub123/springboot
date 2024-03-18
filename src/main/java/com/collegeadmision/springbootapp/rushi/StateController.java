package com.collegeadmision.springbootapp.rushi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StateController {
    @GetMapping(path = "ListofStatesInTheWorld")
    public List<String> getStates() {
        return Arrays.asList("BIHAR", "MAHARASHTRA","JHARKHAND");

    }

}
