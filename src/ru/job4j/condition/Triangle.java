package ru.job4j.condition;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        System.out.println("введите стороны треугольника:");
        double ab, ac, bc;
        Scanner in = new Scanner(System.in);
        ab = in.nextDouble();
        ac = in.nextDouble();
        bc = in.nextDouble();
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }
}
