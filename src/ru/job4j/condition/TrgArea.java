package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double one = a + b + c;
        double two = one/2;
        double tree = two - a ;
        double tree1 = two - b;
        double tree2 = two - c;
        double four = tree*tree1*tree2;
        double five = two * four;
        double rsl = Math.sqrt(five);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}