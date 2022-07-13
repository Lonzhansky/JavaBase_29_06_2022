package com.hillel.lonzhansky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = getNumber();
//        int a = 7;
//        int b = 10;


//        if (b > a) {
//            System.out.println("b > a");
//        } else if (b < a) {
//            System.out.println("b < a");
//        } else {
//            System.out.println("b == a");
//        }


//        if (b == 1) {
//            System.out.println("number = " + 1);
//        } else if (b == 2) {
//            System.out.println("number = " + 2);
//        } else if (b == 3) {
//            System.out.println("number = " + 3);
//        } else if (b == 4) {
//            System.out.println("number = " + 4);
//        } else if (b == 5) {
//            System.out.println("number = " + 5);
//        }


//        if (b >= a) {
//            System.out.println("b >= a");
//
//            if (b == a) {
//                System.out.println("b = a");
//            } else {
//                System.out.println("b > a");
//            }
//        } else {
//            System.out.println("b < a");
//        }

//        int number = getNumber();
//        int number2 = 2;
//        System.out.println(number);
//
//        if (number % 2 == 0) {
//            System.out.println("Четное");
//        } else {
//            System.out.println("Не четное");
//        }


//        int a = 1;
//        int b = 5;
//        int c = 5;


        // Логическое И ->  &&
        // Логическое ИЛИ ->  ||

//        if (true && false) -> false
//        if (true || false) -> true


//        if (true || false && true) -> (true && true) -> true

//        if (true || (false && true)) -> (true || false) -> true

//        if ((a < b) || (c > b) && (10 > 4)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


//        int x = 10;
//        System.out.println(x);
//
//        if ((x > 11) || (--x == 9)) {
//            System.out.println("YES");
//        }
//
//        System.out.println(x);

//        int a = 5;
//
//        switch (a) {
//            case 5:
//                System.out.println("value = 5");
//                break;
//            case 7:
//                System.out.println("value = 7");
//                break;
//            case 10:
//                System.out.println("value = 10");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }


//        String str1 = "AAA";
//        String str2 = "AAA";
//        String str3 = new String("aaa");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println();
//
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//        System.out.println();
//        System.out.println(str1.equalsIgnoreCase(str3));

//        // Сравнение по значению
//        if (str1.equals(str3)) {
//
//        }

//        // сравнение по ссылке
//        if (str1 == str3) {
//
//        }

//        switch (str1) {
//            case "AAa":
//                System.out.println("BBB");
//                break;
//            case "aaa":
//                System.out.println("CCC");
//                break;
//            case "AAA":
//                System.out.println("AAA");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter team name");
        String str1 = scanner.next();
        System.out.println(str1);

        System.out.println("Please enter count frags for player 1");
        int number1 = 0;

        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("Please enter count frags for player 2");
        int number2 = scanner.nextInt();
        System.out.println("Please enter count frags for player 3");
        int number3 = scanner.nextInt();
        System.out.println("Please enter count frags for player 4");
        int number4 = scanner.nextInt();
        System.out.println("Please enter count frags for player 5");
        int number5 = scanner.nextInt();
        System.out.println("number = " + number1);
        System.out.println("number = " + number2);
        System.out.println("number = " + number3);
        System.out.println("number = " + number4);
        System.out.println("number = " + number5);




    }


    static int getNumber(Scanner scanner) {
        return (int) (Math.random() * 11); // 0.0 - 0.99....
    }
}
