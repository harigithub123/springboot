package com.example.demo.designpattern.observer;

public class CurrentTemperatureObserver implements TemperatureObserver {
    @Override
    public void updateTemperature(float temperature) {
        System.out.println("Current Temperature is - " + temperature);
    }
}
