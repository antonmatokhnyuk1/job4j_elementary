package ru.job4j.converter;

public class Converter {

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    public static void main(String[] args) {
        int dollar = Converter.dollarToRuble(1);
        int euro = Converter.euroToRuble(1);
        System.out.println("1 ruble are " + dollar + " dollar.");
        System.out.println("1 ruble are " + euro + " euro");
    }
}