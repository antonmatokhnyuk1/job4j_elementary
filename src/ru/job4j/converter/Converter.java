package ru.job4j.converter;

public class Converter {

    public static int rubleToDollar(int value) {
        int rsl = value / 1;
        return rsl;
    }

    public static int rubleToEuro(int value) {
        int rsl = value / 1;
        return rsl;
    }

    public static void main(String[] args) {
        int dollar = Converter.rubleToDollar(60);
        int euro = Converter.rubleToEuro( 70);
        System.out.println("1 dollars are " + dollar + " ruble.");
        System.out.println("1 euros are " + euro + " ruble.");
    }
}
