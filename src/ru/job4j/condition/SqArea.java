package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double one = p / (2 * (k + 1));
        double two = one * k;
        double rsl = one * two;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, S = " + result1);
    }
}