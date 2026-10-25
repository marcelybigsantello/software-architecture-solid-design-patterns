package com.masantello.designpatterns.behavioralpatterns.strategy.exercise;

public class App {

    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();

        imageManager.setDevicesRenderStrategy(new SmartphoneRenderer());
        imageManager.show();
    }
}
