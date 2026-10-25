package com.masantello.designpatterns.behavioralpatterns.strategy.exercise;

public class ImageManager {

    private DevicesRendererStrategy devicesRendererStrategy;

    public void setDevicesRenderStrategy(DevicesRendererStrategy renderer) {
        this.devicesRendererStrategy = renderer;
    }

    public void show() {
        this.devicesRendererStrategy.showImage();
    }
}