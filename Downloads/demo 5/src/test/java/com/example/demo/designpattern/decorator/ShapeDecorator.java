package com.example.demo.designpattern.decorator;

public class ShapeDecorator implements Shape {
    protected Shape shape;
    @Override
    public void draw() {
        this.shape.draw();
    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
