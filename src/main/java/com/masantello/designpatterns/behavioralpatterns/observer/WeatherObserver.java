package com.masantello.designpatterns.behavioralpatterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeatherObserver implements Observer {

    private static final Logger logger = LoggerFactory.getLogger(WeatherObserver.class);

    private int pressure;
    private int temperature;
    private int humidity;
    private final Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        logger.info("Pressure: {} - Temperature: {} - Humidity: {}", this.pressure, this.temperature, this.humidity);
    }
}
