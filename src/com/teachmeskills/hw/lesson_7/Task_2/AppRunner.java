package com.teachmeskills.hw.lesson_7.Task_2;

import java.util.Arrays;

public class AppRunner {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(21),
                new Rectangle(5, 6),
                new Treeangle(7, 7, 7),
                new Circle(78),
                new Rectangle(42, 24)
        };

        Arrays.stream(figures).forEach(figure -> {
            System.out.println(figure.toString());
            System.out.printf("Perimeter : %.2f\n", figure.getPerimeter());
            System.out.printf("Square : %.2f\n", figure.getSquare());
        });
        System.out.printf("Sum of perimeters: %.2f", Arrays.stream(figures).mapToDouble(Figure::getPerimeter).sum());
    }
}
