package com.masantello.designpatterns.behavioralpatterns.observer.stockexchange;

public class App {

    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        stockExchange.addObserver(new BuyStockListener());
        stockExchange.addObserver(new SellStockExchange());
        stockExchange.start();
    }
}
