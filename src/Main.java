import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        getTripleArray();
        //getChessBoard();

    }
    //    Создать трехмерный массив из целых чисел.
//    С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//    заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//    задается из консоли.
    public static void getTripleArray() {
        int[][][] cubeNames2 = new int[][][]{
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        for (int j = 0; j < cubeNames2.length; j++) {
            for (int y = 0; y < cubeNames2[j].length; y++) {
                for (int z = 0; z < cubeNames2[j][y].length; z++) {
                    System.out.print(cubeNames2[j][y][z] + " - ");
                }
                System.out.println();
            }
        }
            Scanner enter = new Scanner(System.in);
            System.out.print("Please, enter your number: ");
            int increment = enter.nextInt();
            for (int j = 0; j < cubeNames2.length; j++) {
                for (int y = 0; y < cubeNames2[j].length; y++) {
                    for (int z = 0; z < cubeNames2[j][y].length; z++) {
                        cubeNames2[j][y][z] += increment;
                    }
                }
            }
            System.out.println("New array after change: ");
            for (int j = 0; j < cubeNames2.length; j++) {
                for (int y = 0; y < cubeNames2[j].length; y++) {
                    for (int z = 0; z < cubeNames2[j][y].length; z++) {
                        System.out.print(cubeNames2[j][y][z] + " - ");
                    }
                    {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }


//    Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8.
//    С помощью циклов задать элементам циклам значения B(Black) или W(White).  Результат работы программы:

            public static void getChessBoard () {
                 String[][] array = new String[8][8];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if ((i + j) % 2 == 0) array[i][j] = "W";
                        else array[i][j] = "B";

                        System.out.print(" " + array[i][j]);
                    }
                    System.out.println();
                }
            }
}





