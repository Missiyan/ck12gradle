package com.example;

public class Circle {

    // Метод для вычисления площади круга
    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        return Math.PI * radius * radius;
    }
}