package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        // Используем теорему Пифагора для расчета расстояния
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = distance(-20, -32, 71, 56);
        System.out.println("result (-20, -32) to (71, 56) " + result);
    }
}
