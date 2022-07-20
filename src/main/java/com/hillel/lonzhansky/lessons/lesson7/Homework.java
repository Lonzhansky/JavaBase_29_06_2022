package com.hillel.lonzhansky.lessons.lesson7;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        task2();
    }


    static void task2() {
        int countShuttle = 1;
        int numberShuttle = 3999;

        while (countShuttle <= 100) {
            if (check(numberShuttle)) {
                System.out.println("number: " + numberShuttle + " - count shuttle: " + countShuttle);
                countShuttle++;
            }
            numberShuttle++;
        }

    }


    static boolean check(int number) {
//        45 ->
//        number / 10 = 4.5 -> int = 4
//        number % 10 = 4.5 -> int = 5

//        145 ->
//        number / 100 - 1.45 -> 1
//        number / 10 % 10 - 14.5 % 10 ->  1.4 -> 4
//        number % 10 - 14.5 -> 5

        // ВАРИАНТ 1
//        if (number == 4 || number == 9 || number % 10 == 4 || number % 10 == 9 || (number % 100) / 10 == 4 || (number % 100) / 10 == 9) {
//            return false;
//        } else {
//            return true;
//        }

//        return !(number == 4 || number == 9 || number % 10 == 4 || number % 10 == 9 || (number % 100) / 10 == 4 || (number % 100) / 10 == 9);


//        // ВАРИАНТ 2
//        int result = number % 10;
//        do {
//            if (result == 4 || result == 9) {
//                return false;
//            }
//            number /= 10;
//            result = number % 10;
//        } while (number > 0);
//
//        return true;


        //ВАРИАНТ 3
//        return !(String.valueOf(number).contains("4") || String.valueOf(number).contains("9"));
        return !(Integer.toString(number).contains("4") || Integer.toString(number).contains("9"));
    }


    // ------------------------------------------//




//    Сделать игру, в которой нужно отгадать целое число, которое "загадал" компьютер в диапазоне от 0 до 10
//    У пользователя должна быть возможность угадывать в несколько попыток (минимум 3).
    static void task1() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 11);
        System.out.println(randomNumber);
        int count = 3;
        System.out.println("Please input number from 0 to 10");
        System.out.println("You have attempts: " + count);
        do {
            if (randomNumber == getNumber(scanner)) {
                System.out.println("you win!!!");
                break;
            } else {
                count--;
                System.out.println("wrong data, you have attempts: " + count);
            }
        } while (count > 0);
    }

    static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= 0 && result <= 10) {
                    return result;
                } else {
                    System.out.println("please enter number from 0 to 10");
                }
            } else {
                System.out.println("wrong input. try again");
                scanner.next();
            }
        }
    }

}
