package com.teachmeskills.hw.lesson_7.Task_2;

public class Circle extends Figure {
    private double radius;
    private final double PI = Math.PI;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    protected double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    protected double getSquare() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
