package com.teachmeskills.hw.lesson_7.Task_2;

public class Treeangle extends Figure {
    private double angle1Height;
    private double angle2Height;
    private double angle3Height;

    public Treeangle(double angle1Height, double angle2Height, double angle3Height) {
        this.angle1Height = angle1Height;
        this.angle2Height = angle2Height;
        this.angle3Height = angle3Height;
    }

    @Override
    protected double getPerimeter() {
        return angle1Height + angle2Height + angle3Height;
    }

    @Override
    protected double getSquare() {
        return Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - angle1Height) * (getPerimeter()/2 - angle2Height) * (getPerimeter()/2 - angle3Height));
    }

    @Override
    public String toString() {
        return "Treeangle{" +
                "angle1Height=" + angle1Height +
                ", angle2Height=" + angle2Height +
                ", angle3Height=" + angle3Height +
                '}';
    }
}
