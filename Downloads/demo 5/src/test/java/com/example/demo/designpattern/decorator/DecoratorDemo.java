package com.example.demo.designpattern.decorator;

import org.checkerframework.checker.units.qual.C;

public class DecoratorDemo {
    public static void main(String[] args) {
        CircleShape circleShape = new CircleShape();
        RectangleShape rectangleShape = new RectangleShape();
        Shape redRectangle = new RedShapeDecorator(new RectangleShape());
        Shape redCircle = new RedShapeDecorator(new CircleShape());
        circleShape.draw();
        rectangleShape.draw();
        redRectangle.draw();
        redCircle.draw();
    }
}
