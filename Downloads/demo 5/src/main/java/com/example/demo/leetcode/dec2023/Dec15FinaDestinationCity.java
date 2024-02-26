package com.example.demo.leetcode.dec2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dec15FinaDestinationCity {
    /**
     *  * Daily Challenge date - 15th Dec 2023
     *  * Problem Solved Date  - 22nd Dec 2023
     */
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(List.of("B","C"));
        paths.add(List.of("D","B"));
        paths.add(List.of("C","A"));
        System.out.println(destCity(paths));
        paths = new ArrayList<>();
        paths.add(List.of("B","C"));
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Map<String,String> cityPathMap = new HashMap<>();
        String destinationCity = paths.get(0).get(1);
        for(List<String> path: paths) {
            if(path.get(0).equals(destinationCity)) {
                destinationCity = path.get(1);
            }
        }
//        paths.stream().forEach(list -> cityPathMap.put(list.get(0), list.get(1)));
//        while(cityPathMap.containsKey(destinationCity)) {
//            destinationCity = cityPathMap.get(destinationCity);
//        }
        return destinationCity;
    }
}
