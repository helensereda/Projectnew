// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your

import java.util.Scanner;
 class Main
 {
    public static void main(String[] args) {

        //getInformation();
        getData();
        //getBodyMassIndex();

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
            int weight = enter.nextInt();

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

             System.out.print("Enter your weight: ");
             float weight = enter.nextFloat();

             System.out.print("Enter your height in meters: ");
             float height = enter.nextFloat();
             float height1 = height*height;
             float height2 = weight /height1;
             int BMI = (int)Math.round(height2);
             System.out.println("BMI = " + BMI+ " kg/m2");
             enter.close();

         }
}