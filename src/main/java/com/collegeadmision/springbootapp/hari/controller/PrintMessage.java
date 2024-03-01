package com.collegeadmision.springbootapp.hari.controller;

import com.collegeadmision.springbootapp.hari.Student;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrintMessage {

    @GetMapping(path = "/printmessage/{message}")
    public void printMessageUsingPathVariable(@PathVariable("message") String userMessage) {
        System.out.println(userMessage);

    }

    @GetMapping(path = "/printmessage")
    public void printMessageUsingQueryParam(@RequestParam("message") String userMessage) {
        System.out.println(userMessage);

    }

}
