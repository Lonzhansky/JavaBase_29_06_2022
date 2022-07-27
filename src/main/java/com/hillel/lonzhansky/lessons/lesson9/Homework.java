package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 7;
        int[] arrayGroup = new int[ARRAY_LENGTH];
        int[] arrayPlayer = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayGroup[i] = (int) (Math.random() * 10);
            arrayPlayer[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(arrayGroup);
        Arrays.sort(arrayPlayer);

        int count = 0;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (arrayGroup[i] == arrayPlayer[i]) {
                System.out.println("Совпал " + (i + 1) + " элемент");
                count++;
            }
        }

        System.out.println(Arrays.toString(arrayGroup));
        System.out.println(Arrays.toString(arrayPlayer));
        System.out.println("count = " + count);
    }
}
