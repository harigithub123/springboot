package com.example.demo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("Hari");
        list.add("Hari");
        list.remove("Hari");
        if(list.contains("Hari")) {

        }

        set.add("Hari");
        set.add("Hari");
        set.remove("Hari");
        if(set.contains("Hari")) {

        }

        System.out.println(list.size());
        System.out.println(set.size());
    }
}
