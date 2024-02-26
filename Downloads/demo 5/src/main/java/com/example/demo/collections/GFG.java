package com.example.demo.collections;

import java.util.*;
 
// Class 1
// Main class
// ArrayListSorting
class GFG {
 
    // Main driver method
    public static void main(String args[]) {
 
        // Creating an empty ArrayList of Student type
        ArrayList<StudentB> arraylist
            = new ArrayList<>();
 
        // Adding elements to above List
        arraylist.add(new StudentB(12, "Riya", 15));
        arraylist.add(new StudentB(14, "Mahima", 16));
        arraylist.add(new StudentB(13, "Shubhi", 15));

        arraylist.sort((o1, o2) -> {
            return o1.getStudentage() - o2.getStudentage();
        });
        // Sorting above list using sort() method
        // of Collections class
        Collections.sort(arraylist);
 
        // Iterating over list via for each loop and
        // printing all elements inside the List
        for (StudentB str : arraylist) {
            System.out.println(str);
        }
    }
}