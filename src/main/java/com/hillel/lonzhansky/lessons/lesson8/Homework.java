package com.hillel.lonzhansky.lessons.lesson8;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        final int COUNT_PLAYER = 25;

        int[] team1 = new int[COUNT_PLAYER];
        int[] team2 = new int[COUNT_PLAYER];

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        fillArray(team1);
        fillArray(team2);

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        System.out.println(calculateAvgAge(team1));
        System.out.println(calculateAvgAge(team2));
    }

    static void fillArray(int[] array) {
        int max = 40;
        int min = 18;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }
    }


    static double calculateAvgAge(int[] array) {
        double sumTeamAge = 0;
        for (int value : array) {
            sumTeamAge += value;
        }
        return sumTeamAge / array.length;
    }
}
