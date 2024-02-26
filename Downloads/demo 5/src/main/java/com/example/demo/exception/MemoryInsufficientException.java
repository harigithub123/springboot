package com.example.demo.exception;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MemoryInsufficientException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 1; ) {
            list.add("Hello");
        }
    }
}
