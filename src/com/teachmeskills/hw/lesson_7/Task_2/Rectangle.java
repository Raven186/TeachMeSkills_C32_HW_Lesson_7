package com.teachmeskills.hw.lesson_7.Task_2;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    protected double getSquare() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
