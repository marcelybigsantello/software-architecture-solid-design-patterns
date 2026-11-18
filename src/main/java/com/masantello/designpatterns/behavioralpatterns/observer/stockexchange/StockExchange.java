package com.masantello.designpatterns.behavioralpatterns.observer.stockexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject{

    private static final Logger logger = LoggerFactory.getLogger(StockExchange.class);

    private float price = 100f;
    private final Random random;
    private final List<Observer> observers;

    public StockExchange() {
        random = new Random();
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                logger.error("Erro: {}. Exception: {}", e.getMessage(), e.getStackTrace());
            }

            // generate the next S(t+1) random stock price
            price = price + 2 * random.nextFloat() - 1;
            notifyAllObservers();
            logger.info("Preço: {}", price);
        }
    }
}
