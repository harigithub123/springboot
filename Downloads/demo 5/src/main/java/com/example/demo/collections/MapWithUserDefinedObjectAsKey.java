package com.example.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapWithUserDefinedObjectAsKey {
    public static void main(String[] args) {
        Map<Student, String> studentsMap = new HashMap<>();

        studentsMap.put(new Student("Hari",1), "Hari");
        studentsMap.put(new Student("Pooja",2), "Pooja");
        studentsMap.put(new Student("Shree",3), "Shree");
        studentsMap.put(new Student("Kiran",1), "Kiran");

        studentsMap.entrySet().stream().forEach(entry -> System.out.println(entry));

    }
}


