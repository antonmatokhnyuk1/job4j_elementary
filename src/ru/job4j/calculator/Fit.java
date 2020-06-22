package ru.job4j.calculator;

public class Fit {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double manWeight(double height) {
        double rsl = (176-100) * 1.15;
        return rsl;
    }


    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double womanWeight(double height) {
        double rsl = (166-110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(176);
        double woman = Fit.womanWeight(166);
        System.out.println("Man 176 cm is "  + man +  "kg");
        System.out.println("Women 166 cm is "  + woman +  "kg");
    }

}