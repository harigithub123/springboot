package com.collegeadmision.springbootapp.hari.controller;

import com.collegeadmision.springbootapp.hari.Student;
import com.collegeadmision.springbootapp.hari.entity.StudentEntity;
import com.collegeadmision.springbootapp.hari.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(path = "saveStudent")
    public void saveStudent(@RequestBody Student s) {
        studentService.createStudent(s);
    }

    @PutMapping(path = "updateStudent")//url / uri uniform resource locator/identifier
    public void updateStudent(@RequestBody Student s) {
        System.out.println(s);
        /**
         * business logic related to saving a student
         */
    }

    @DeleteMapping(path = "deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") int id) {
        System.out.println("student deleted with ID = "+ id);
        return "student deleted with ID = "+ id;
        /**
         * business logic related to saving a student
         */
    }

    @GetMapping(path = "getStudent")
    public String getStudentInfo(@RequestParam("studentId") Long id) {
        StudentEntity s = studentService.getStudent(id);
        return s.toString();
    }

}
