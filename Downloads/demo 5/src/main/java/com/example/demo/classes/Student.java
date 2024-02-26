package com.example.demo.classes;

public class Student {//pojo (plain old java object) model classes
    private int rollNo;
    private String name;
    private static int studentCount;//data inconsistency
    private static String classTeacher;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int count) {
        studentCount = count;
    }

    public static String getClassTeacher() {
        return classTeacher;
    }
}

