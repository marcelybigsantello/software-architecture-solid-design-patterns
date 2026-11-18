package com.masantello.designpatterns.behavioralpatterns.observer;

public class App {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setHumidity(100);
        station.setPressure(2);
        station.setTemperature(20);

        observer.update(10, 10, 10);
    }
}

