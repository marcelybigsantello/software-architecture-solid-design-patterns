package com.masantello.designpatterns.behavioralpatterns.observer.stockexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SellStockExchange implements Observer {

    private static final Logger logger = LoggerFactory.getLogger(SellStockExchange.class);

    @Override
    public void update(float price) {
        if (price > 105f) {
            logger.info("Selling the stock because the S(t) price is too high...");
        }
    }
}
