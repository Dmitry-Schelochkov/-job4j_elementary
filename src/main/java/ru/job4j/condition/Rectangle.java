package ru.job4j.condition;

public class Rectangle {
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double result = diagonal(15, 8);
        System.out.println("Diagonal of rectangle with length 15 and width 8 is " + result);
    }
}
