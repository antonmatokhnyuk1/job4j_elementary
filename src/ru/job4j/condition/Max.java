package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        boolean condition = true;
        int result = condition ? left : right;
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String msg = Max.max(1, 2);
        System.out.println(msg);
    }
}


