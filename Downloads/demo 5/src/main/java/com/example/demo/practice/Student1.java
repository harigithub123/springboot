package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student1 {
    private String mobileNumber;
    private String name;
    private float percentage;

    public Student1(String mobileNumber, String name, float percentage) {
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public static void main(String[] args) {
        int n;
        Scanner s  = new Scanner(System.in);
        System.out.println("How many student data need to enter");
        n = s.nextInt();
        s.nextLine();
        Student1 students[] = new Student1[n];
        for(int i = 0 ;i < n ; i++) {
            String name, mobileNumber; float percentage;
            name = s.nextLine();
            mobileNumber = s.nextLine();
            percentage = s.nextFloat();
            s.nextLine();
            Student1 stud = new Student1(mobileNumber, name, percentage);
            students[i] = stud;
            String str = new String();
            List<String> ls = new ArrayList<>();
            /**
             3
             \n
             Hari\n
             878787
             \n
             87.0\n
             Rushi\n
             */
        }
        for(int i = 0;i<n;i++) {
            if(students[i].getPercentage() > 75) {
                System.out.println(students[i].getName());
            }
        }
    }
}