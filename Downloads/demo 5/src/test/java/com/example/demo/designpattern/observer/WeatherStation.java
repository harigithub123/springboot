package com.example.demo.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private float temperature;
    List<TemperatureObserver> observerList = new ArrayList<>();

    public void addObserver(TemperatureObserver observer) {
        observerList.add(observer);
    }

    public void setTemperature(float currentTemperature) {
        this.temperature = currentTemperature;
        for(TemperatureObserver observer : observerList) {
            observer.updateTemperature(currentTemperature);
        }
    }
}
