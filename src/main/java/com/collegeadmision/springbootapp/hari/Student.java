package com.collegeadmision.springbootapp.hari;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private int rollNo;
    private String emailId;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
