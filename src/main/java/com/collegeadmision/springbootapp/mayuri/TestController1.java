package com.collegeadmision.springbootapp.mayuri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController1 {
    @GetMapping(path = "kpopBand")
    public List<String> getBand(){
        return Arrays.asList("one Direction", "Got-7", "BTS");
    }

}
