package com.hillel.lonzhansky.lessons.lesson3;

public class Homework2 {
    public static void main(String[] args) {
        float a = 5.7f;
        int b = 7;
        int c = 12;

        float volume = (a * b * c);

        System.out.println("volume = " + volume);


        float length = (a * 4) + (b * 4) + (c * 4);
        float length2 = (a + b + c) * 4;

        System.out.println(length);
        System.out.println(length2);
    }
}
