package com.masantello.designpatterns.behavioralpatterns.strategy.exercise;

public class SmartphoneRenderer implements DevicesRendererStrategy {

    @Override
    public void showImage() {
        System.out.println("Showing an image on smartphone...");
    }
}
