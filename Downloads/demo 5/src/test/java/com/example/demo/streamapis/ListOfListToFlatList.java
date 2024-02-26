package com.example.demo.streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListToFlatList {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = new ArrayList<>();
        for(int i=0;i<5;i++) {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<3;j++) {
                l.add(i*j);
            }
            nestedList.add(l);
        }

        List<Integer> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
