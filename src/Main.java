import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        //checkNumber();
        getArrayWithoutNumber();
        //getMinMaxAverage();
        // equalAverage();
    }

    //0
    public static void checkNumber() {

        int[] number = new int[]{4, 6, 78, 12, 48, 9, -7};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);   //вывести массив на экран
        }
        System.out.print("Please, enter your number: ");
        Scanner enter = new Scanner(System.in);
        int size = enter.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == size) {
                System.out.print("There is such a number in the array: ");
                break;
            }
            if (i == number.length - 1) {
                System.out.print("There is no a number in the array: ");
            }
            enter.close();
        }
    }

    //1
    public static void getArrayWithoutNumber () {
        int[] array = new int[]{5, 8, 19, 63, 54};
        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter your number: "); //число для удаления
        int number = enter.nextInt();
        boolean found = false;
        int newSize = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == number) {
                found = true;
            } else {
                array[newSize] = array[i];
                newSize++;
            }
//         Вывод результата
        if (found) {
            int[] newArray = new int[newSize]; // новый массив
            System.arraycopy(array, 0, newArray, 0, newSize);
            //System.arrayCopy(from, fromIndex, to, toIndex, count);
//            from - массив, который копируем
//            to - массив в которой копируем
//            fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
//            toIndex - индекс в массиве to начиная с которого вставляем элементы
//            count - количество элементов которые берем из массива from и вставляем в массив to
//            Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
            System.out.println("Элементы массива после удаления:");

            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }

        } else {
            System.out.println("Число не найдено в массиве.");
        }
    }

    //2
    public static void getMinMaxAverage () {
        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter your  size arrays: ");
        int size = enter.nextInt();

        int[] mass = new int[size];// создание массива
        Random random = new Random();// заполнение массива случайными числами
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(10); // шагать рандому до кагого числа
        }
//            mass[i] = enter.nextInt();
//        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + "-" + mass[i]);
        }

        int min = mass[0];
        int max = mass[0];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] < min) {
                min = mass[i];
                //System.out.println("цикл  бежит по мин: " + min); // цикл бежит по мин
            }
            if (mass[i] > max) {
                max = mass[i];
                //System.out.println("цикл  бежит по макс: " + max); // цикл бежит по макс
            }
            sum = sum + mass[i];
            //System.out.println("цикл  бежит: " + sum); // цикл бежит
        }
        double average = (double) sum / size;
        // Вывод результатов
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
        enter.close();
    }

    //3.
    public static void equalAverage () {
        // вывод массива на консоль
        int[] array1 = new int[]{0, 12, 9, 8, 82};
        int[] array2 = new int[]{1, 16, 7, 8, 90};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        // сравнение средн.арифмитич. и вывод результата
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        double average = (double) sum / 5;
        System.out.println("Arithmetic mean array1: " + average);  //среднее арифмит.зн. sum

        for (int i = 0; i < array2.length; i++) {
            sum1 = sum1 + array2[i];
        }
        double average1 = (double) sum1 / 5;
        System.out.println("Arithmetic mean array2: " + average1);  //среднее арифмит.зн.sum1

        if (average > average1) {
            System.out.println("The arithmetic mean of the first array is greater");
        } else if (average < average1) {
            System.out.println("The arithmetic mean of the second array is greater");
        } else {
            System.out.println("The arithmetic mean equal");
        }
    }
}