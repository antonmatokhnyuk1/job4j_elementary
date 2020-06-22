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
        System.out.println("1 dollar are " + dollar + " rubless ");
        System.out.println("1 euro are " + euro + " rubless ");
        int in = 2;
        int expected = 120;
        int out =dollarToRuble(in);
        boolean passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
        int in1 = 2;
        int expected1 = 140;
        int out1 = euroToRuble(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
    }
}