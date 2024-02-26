package com.example.demo.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * int, float, double, long, boolean , char, - primitive Data types
 * Integer, Float, Double, Long, Boolean, Character, String - Wrapper Class
 * Map Properties
 *  1. Map will always store values on the basis of key
 *  2. We can't have duplicate keys in a map.
 *  3. In Map we can't use primitive data types for key and value (By rule)
 *
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(112,"Hari");
        students.put(112,"Nale");
        students.put(2123,"Mayuri");
        students.put(123123,"Advait");
        students.put(123123,"Pratiksha");
        System.out.println(students.get(112));
    }
}
