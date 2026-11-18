package com.masantello.designpatterns.behavioralpatterns.observer.stockexchange;

public interface Subject {
    void addObserver(Observer o);
    void notifyAllObservers();
}

