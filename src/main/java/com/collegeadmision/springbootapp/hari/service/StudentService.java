package com.collegeadmision.springbootapp.hari.service;

import com.collegeadmision.springbootapp.hari.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students  = new ArrayList<>();
    public String createStudent(Student s) {
        s.setId(students.size()+1);
        students.add(s);
        return "student Created with Id " + s.getId();
    }

    public Student getStudent(int id) {
        return students.get(id-1);
    }
}
