package com.example.demo.practice;

public class Student {
    public static int studentCount;
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        Student.studentCount++;
        this.rollNo = rollNo;
        this.name = name;
    }

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

    public String numberIsOddOrEven(int no) {
        if (no % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}