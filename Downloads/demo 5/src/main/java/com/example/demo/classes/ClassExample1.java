package com.example.demo.classes;

/**
 * Write a program to read Employee information and display same
 *
 */
public class ClassExample1 {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setName("Satish");
        e1.setSalary(29000f);
        e1.setEmployeeId(12345);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getEmployeeId());
        Employee e2 = new Employee();
        e2.setName("Rushikesh");
        e2.setSalary(49000f);
        e2.setEmployeeId(12345);
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
        System.out.println(e2.getEmployeeId());
    }
}


