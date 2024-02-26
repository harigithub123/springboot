package com.example.demo;

import java.util.Scanner;

/**
 * we can have multiple classes in one java file.
 * we can have only 1 public class in one java file.
 * FileName should be same as public class name.
 * we can't have class inside another class
 */
 public class ClasExample1 {
    public static void main(String args[]) {
        Student stud = new Student();
        Scanner s = new Scanner(System.in);

            //stud = new Student();//initialize
            String name = s.nextLine();
            stud.setName(name);
            stud.rollNo = s.nextInt();

            System.out.println(stud.getName());
            System.out.println(stud.rollNo);
    }
}


 class Student {
    private String name;
    public int rollNo;

    //methods
     //getters and Setters method
     public void setName(String studentName) {
         name = studentName;
     }
     public String getName() {
         return name;
     }
}