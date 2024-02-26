package com.example.demo.practice;

public class ImmutableImplementation {
    public static void main(String[] args) {

    }
}

final class Immutable {
    private String name;
    private int rollNo;

    public Immutable(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
