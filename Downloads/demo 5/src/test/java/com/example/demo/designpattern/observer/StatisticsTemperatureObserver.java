package com.example.demo.designpattern.observer;

public class StatisticsTemperatureObserver implements TemperatureObserver {
    @Override
    public void updateTemperature(float temperature) {
        System.out.println("Current Temperature Statistics - " + temperature);
    }
}
