package com.example.demo.designpattern.decorator;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
