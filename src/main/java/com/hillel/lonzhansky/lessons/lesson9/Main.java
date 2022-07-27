package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[][] array = new int[2][4];
//
//        array[0][0] = 10;
//        array[0][1] = 11;
//        array[0][2] = 12;
//        array[0][3] = 13;
//
//        array[1][0] = 20;
//        array[1][1] = 21;
//        array[1][2] = 22;
//        array[1][3] = 23;

//        int[][] array = {
//                {10, 11, 12, 13},
//                {20, 21, 22, 23},
//                {30, 31, 32, 33},
//                {40, 41, 42, 43},
//                {50, 51, 52, 63},
//        };

//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);

//        int[][] array = new int[5][3];


//        int[][] array = {
//                {1},
//                {20, 21},
//                {30, 31, 32, 33},
//                {},
//                {50, 51, 52, 63, 77, 555, 42, 23, 23},
//        };
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);
//        System.out.println(array[4].length);

//        int count = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = count++;
//            }
//        }


//        System.out.println(Arrays.deepToString(array));

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


        int[][][] array = {
                {
                        {18, 28, 18, 28}, {45, 90, 45, 0}
                },
                {
                        {7, 125, 500, 5}, {0, 11, 25, 30}
                },
                {
                        {81, 17, 19, 55}, {1, 7, 38, 11}
                }
        };

//        System.out.println(Arrays.deepToString(array));


//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

//        System.out.println(Arrays.deepToString(array[0]));


//        for (int i = 0; i < array[0].length; i++) {
//            for (int j = 0; j < array[0][i].length; j++) {
//                System.out.print(array[0][i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println(array[0][0][0]);
//        System.out.println(array[0][0][1]);
//        System.out.println(array[0][0][2]);
//        System.out.println(array[0][0][3]);
//
//        System.out.println(array[0][1][0]);
//        System.out.println(array[0][1][1]);
//        System.out.println(array[0][1][2]);
//        System.out.println(array[0][1][3]);

//        demo1();


//        task1();
//        task2();
        task3();

    }

    static void task3() {
        int[][] array = new int[4][4];

        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("AFTER");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }


//    С помощью циклов создать шахматную доску 8х8 вида:
//
//    B W B W B W B W  // 00, 02, 04, 06  - 0, 2, 4, 6
//    W B W B W B W B  // 11, 13, 15, 17  - 2, 4, 6, 8
//    B W B W B W B W  // 20, 22, 24, 26  - 2, 4, 6, 8
//    W B W B W B W B  // 31, 33, 35, 37  - 4, 6, 8, 10
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B

//    10 % 2 = 0
//    11 % 2 = 5.222

    static void task2() {
        char[][] array = new char[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    array[i][j] = 'B';
//                } else {
//                    array[i][j] = 'W';
//                }

                array[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }




//    Создать массив размером 5x5. Заполнить массив с помощью цикла таким
//    образом, чтобы единица в каждой строке смещалась вправо:

//    1 0 0 0 0
//    0 1 0 0 0
//    0 0 1 0 0
//    0 0 0 1 0
//    0 0 0 0 1

//    1 0 0 0 1
//    0 1 0 1 0
//    0 0 1 0 0
//    0 1 0 1 0
//    1 0 0 0 1

    static void task1() {
        int[][] array = new int[5][5];

//        array[0][0] = 1;
//        array[1][1] = 1;
//        array[2][2] = 1;
//        array[3][3] = 1;
//        array[4][4] = 1;

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

        // 0 4
        // 1 3
        // 2 2
        // 3 1
        // 4 0
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j >= 0 ; j--) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {

            if (i + j == array.length - 1) {
                array[i][j] = 1;
            }
//            if (i == j) {
//                continue;
//            }
//            array[i][j] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }

    static void demo1() {
        int[][] array = {
                {10, 11, 12, 13},   //0
                {20, 21, 22, 23},   //1
                {30, 31, 32, 33},   //2
                {40, 41, 42, 43},   //3
                {50, 51, 52, 63}    //4
        };

//        array[2][2] = 77;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println(array[3][0]);
//        System.out.println(array[3][1]);
//        System.out.println(array[3][2]);
//        System.out.println(array[3][3]);

//        for (int i = 0; i < array[3].length; i++) {
//            System.out.print(array[3][i] + "\t");
//        }

        System.out.println(Arrays.toString(array[3]));

    }
}
