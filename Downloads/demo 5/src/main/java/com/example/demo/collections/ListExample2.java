package com.example.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Hari", 1));
        list.add(new Student("Rushi", 2));
        list.add(new Student("Satish", 3));
        list.add(new Student("Sana", 4));
        list.add(new Student("Vaibhav", 5));
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getRollNo() % 7 == 0) {
                System.out.println(s.getName());
            }
        }

    }
}
