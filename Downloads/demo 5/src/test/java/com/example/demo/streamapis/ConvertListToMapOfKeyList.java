package com.example.demo.streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMapOfKeyList {
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        list.add(new Test("Hari",1));
        list.add(new Test("Kiran",2));
        list.add(new Test("Pooja",3));
        list.add(new Test("Shree",4));
        list.add(new Test("Hari-D",1));
        list.add(new Test("Kiran-D",2));
        list.add(new Test("Pooja-D",3));
        list.add(new Test("Shree-D",4));

        Map<Integer, List<Test>> map = list.stream().collect(Collectors.groupingBy(Test::getProperty2));
        System.out.println(map);
    }
}
