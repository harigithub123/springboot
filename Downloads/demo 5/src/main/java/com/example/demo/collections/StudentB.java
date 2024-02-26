package com.example.demo.collections;

// Class 2
// Implementing Comparable interface
public class StudentB implements Comparable<StudentB> {

    // Class data members
    private String studentname;
    private int rollno;
    private int studentage;

    // Constructor of Student class
    public StudentB(int rollno, String studentname,
                   int studentage) {

        // this keyword refers to current instance itself
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }


    // Getter and Setter methods

    public String getStudentname() { return studentname; }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() { return rollno; }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() { return studentage; }
    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }


    // overriding the compareTo method of Comparable class
    @Override public int compareTo(StudentB comparestu) {

        //  For Ascending order
        return this.studentage - comparestu.getStudentage();

        // For Descending order do like this
        // return compareage-this.studentage;
    }

    @Override public String toString() {
        return "[ rollno=" + rollno + ", name="
                + studentname + ", age=" + studentage + "]";
    }
}
