package com.collegeadmision.springbootapp.hari.controller;

import com.collegeadmision.springbootapp.hari.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @PostMapping(path = "saveStudent")
    public void saveStudent(@RequestBody Student s) {
        System.out.println(s);
        /**
         * business logic related to saving a student
         */
    }

    @PutMapping(path = "updateStudent")
    public void updateStudent(@RequestBody Student s) {
        System.out.println(s);
        /**
         * business logic related to saving a student
         */
    }

    @DeleteMapping(path = "deleteStudent/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int id) {
        System.out.println("student deleted with ID = "+ id);
        /**
         * business logic related to saving a student
         */
    }

}
