package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String separate = "  ";
        String status = " But I am a newbie ";
        String id = idea + separate + status;
        System.out.println(id);
        int year = 2020;
        System.out.println(year);
        String id1 = id + separate + year;
        System.out.println(id1);
    }
}
