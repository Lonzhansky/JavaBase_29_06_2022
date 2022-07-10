package com.hillel.lonzhansky.lessons.lesson4;

public class Homework3 {
    public static void main(String[] args) {
        int warrior = 13;
        int archer = 24;
        int rider = 46;

        final int WARRIOR_COUNT = 860;
        double COEFFICIENT = 1.5;


        int allLi = (warrior * 860) + (archer * 860) + (rider * 860);
        int allLi2 = (warrior + archer + rider) * WARRIOR_COUNT;
        int allMin = (int) ((warrior + archer + rider) * WARRIOR_COUNT * COEFFICIENT);

        System.out.println(allLi2);
    }
}
