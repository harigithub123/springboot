package com.example.demo.practice;

public class AbstractClassDemo {
}


abstract class BaseAbstract {
    public abstract void abstractMethod();
    public void nonAbstractMethod() {
        System.out.println("Non abstract method");
    }
}

class ChildClass extends BaseAbstract {

    @Override
    public void abstractMethod() {

    }
}