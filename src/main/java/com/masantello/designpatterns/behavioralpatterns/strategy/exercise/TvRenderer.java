package com.masantello.designpatterns.behavioralpatterns.strategy.exercise;

public class TvRenderer implements DevicesRendererStrategy {

    @Override
    public void showImage() {
        System.out.println("Showing an image on TV...");
    }
}
