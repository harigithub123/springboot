package com.collegeadmision.springbootapp.hari.dao;

import com.collegeadmision.springbootapp.hari.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
