package com.collegeadmision.springbootapp.hari.service;

import com.collegeadmision.springbootapp.hari.Student;
import com.collegeadmision.springbootapp.hari.dao.StudentRepository;
import com.collegeadmision.springbootapp.hari.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String createStudent(Student s) {
        StudentEntity se = new StudentEntity();
        se.setName(s.getName());
        se.setEmailId(s.getEmailId());
        se.setRollNo(s.getRollNo());
        se.setId(s.getId());
        StudentEntity createdObject = studentRepository.save(se);
        return "student Created with Id " + createdObject.getId();
    }

    public StudentEntity getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    public void superMethod() {
        callerMethod();
    }

    public void callerMethod() {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void throwException() {
        if(Math.random()*100 < 5) {
            throw new RuntimeException();
        } else {
            System.out.println("Fine.");
        }
    }
}
