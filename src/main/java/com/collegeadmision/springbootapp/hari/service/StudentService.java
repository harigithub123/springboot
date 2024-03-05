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
        StudentEntity createdObject = studentRepository.save(se);
        return "student Created with Id " + createdObject.getId();
    }

    public StudentEntity getStudent(Long id) {
        return studentRepository.findById(id).get();
    }
}
