package com.example.demo.streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        list.add(new Test("Hari",1));
        list.add(new Test("Kiran",2));
        list.add(new Test("Pooja",3));
        list.add(new Test("Shree",4));
        Map<String, Test> mapByProperty1 = list
                .stream()
                .collect(Collectors.toMap(Test::getProperty1, Function.identity()));
        Map<String, Integer> mapOfProperties = list
                .stream()
                .collect(Collectors.toMap(Test::getProperty1, Test::getProperty2));

    }

}
class Test {
    private String property1;
    private int property2;

    public Test(String property1, int property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public int getProperty2() {
        return property2;
    }

    public void setProperty2(int property2) {
        this.property2 = property2;
    }
}


