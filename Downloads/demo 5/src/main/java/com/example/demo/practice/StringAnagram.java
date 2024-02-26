package com.example.demo.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(br.readLine());
            System.out.println(Integer.parseInt(br.readLine()));
            System.out.println(Float.parseFloat(br.readLine()));
            System.out.println(Boolean.parseBoolean(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
