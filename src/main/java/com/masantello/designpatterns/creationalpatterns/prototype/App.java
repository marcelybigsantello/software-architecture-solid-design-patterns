package com.masantello.designpatterns.creationalpatterns.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Shape circle = new Circle();
        circle.setHeight(10);
        circle.setWidth(20);
        circle.setColor("Yellow");

        System.out.println(circle);

        //When the Prototype is useful: if we have a heavy object, and we do not want to recreate the object because the
        //field variables are so complicated to reproduce
        //Then, we can clone this object with the existing field variables, and we just change the field we need to
        Shape circle2 = circle.clone();
        circle2.setColor("Blue");
        System.out.println(circle2);
    }

}
