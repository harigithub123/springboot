package com.example.demo.designpattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Set Border as red");
    }
}
