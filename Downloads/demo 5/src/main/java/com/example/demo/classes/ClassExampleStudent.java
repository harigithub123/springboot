package com.example.demo.classes;

public class ClassExampleStudent {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Hari");
        s1.setRollNo(123);
        Student.setStudentCount(1);
        System.out.println(Student.getClassTeacher());
        System.out.println(Student.getStudentCount());
    }
}
