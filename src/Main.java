// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your

import java.util.Scanner;
 class Main
 {
    public static void main(String[] args) {

        //getInformation();
        //getData();
        getBodyMassIndex();

    }

    //ONE
        public static void getInformation() {
            Scanner enter = new Scanner(System.in);

            System.out.print("Please, enter your name: ");
            String name = enter.nextLine();

            System.out.print("Please, enter your surname: ");
            String surname = enter.nextLine();

            System.out.print("Please, enter your age: ");
            int age = enter.nextInt();

            System.out.print("Please, enter your height: ");
            int height = enter.nextInt();

            System.out.print("Please, enter your weight: ");
            double weight = enter.nextDouble();

            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            enter.close();

        }

        //TWO
        public static void getData() {


            char myLetter = 'S';
            System.out.println("S - " + (int) myLetter);

            char mySymbol = '%';
            System.out.println("% - " + (int) mySymbol);
        }

         //THREE
         public static void getBodyMassIndex() {

             Scanner enter = new Scanner(System.in);
//Просто нужно запомнить, что когда Вы вводите число типа double в консоли,
             // надо его вводить через запятую. Если бы Вы ввели число в консоль в формате 2.0, программа выдала бы Вам ошибку!
             System.out.print("Enter your weight: ");
             double weight = enter.nextDouble();

             System.out.print("Enter your height: ");
             double height = enter.nextDouble();
             double height1 = height*height;
             double height2 = weight /height1*10000;
             System.out.print("BMI - ");
             System.out.printf("%.1f",height2);
             System.out.print(" kg/m2");
             enter.close();

         }
}
