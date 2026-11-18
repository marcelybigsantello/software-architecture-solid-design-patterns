package com.masantello.designpatterns.behavioralpatterns.observer.stockexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyStockListener implements Observer {

    private static final Logger logger = LoggerFactory.getLogger(BuyStockListener.class);

    @Override
    public void update(float price) {
        if (price < 95) {
            logger.info("Buying stock because the S(t) price is low");
        }
    }
}
