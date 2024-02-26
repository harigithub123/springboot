package com.example.demo.designpattern.decorator;

public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
