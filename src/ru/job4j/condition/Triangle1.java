package ru.job4j.condition;

public class Triangle1 {

    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не сушествует");

        }
        return false;
    }

    public static void main(String[] args) {
        Triangle1.exist(2.0, 2.0, 2.0);

    }
}

