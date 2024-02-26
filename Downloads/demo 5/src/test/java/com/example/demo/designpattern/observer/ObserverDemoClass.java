package com.example.demo.designpattern.observer;

public class ObserverDemoClass {
    public static void main(String[] args) {
        TemperatureObserver temperatureObserver1 = new CurrentTemperatureObserver();
        TemperatureObserver temperatureObserver2 = new StatisticsTemperatureObserver();


        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(temperatureObserver1);
        weatherStation.addObserver(temperatureObserver2);

        weatherStation.setTemperature(35.4f);
        weatherStation.setTemperature(32.5f);
        weatherStation.setTemperature(30.0f);
    }
}
