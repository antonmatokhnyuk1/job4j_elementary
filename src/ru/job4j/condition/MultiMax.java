package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;

    }

    public static void main(String[] args) {
        int msg = MultiMax.max(1, 4,2);
        System.out.println(msg);
    }

}