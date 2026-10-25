package com.masantello.designpatterns.creationalpatterns.prototype;

public abstract class Shape implements Cloneable {

    private Integer width;
    private Integer height;
    private String color;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
