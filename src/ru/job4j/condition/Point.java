package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double first = Math.pow(one, 2);
        double first1 = Math.pow(two, 2);
        double firstPlusFirst1 = first + first1;
        double sqrt = Math.sqrt(firstPlusFirst1);
        double rsl = sqrt;
        return rsl;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}