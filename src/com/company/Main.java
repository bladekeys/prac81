package com.company;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(35.76, "red", true);
        System.out.println(circle);
        Shape rectangle = new Rectangle(45, 56, "blue", false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        Shape square = new Square(45, "yellow", false);
        square.setColor("red");
        System.out.println(square);
    }
}
