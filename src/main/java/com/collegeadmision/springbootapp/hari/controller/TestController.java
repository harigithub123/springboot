package com.collegeadmision.springbootapp.hari.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/testget")
    public String testGet() {
        return "Test Get Method update";
    }
}
