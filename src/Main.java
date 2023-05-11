import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //getSeason();
        //getMonth();
        //getNumber();
        //getTemperature();
        //getColor();
        //whileLoop();
        //forLoop();
        forScan();
        //plusSeven();
        //minusFive();
        //getSquare();

    }

    //1.
    public static String getSeason() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter your month: ");
        int numeral = enter.nextInt();

        String Season;

        switch (numeral) {
            case 1,2,12:
                Season = "Winter";
                break;
            case 3,4,5:
                Season = "Spring";
                break;
            case 6,7,8:
                Season = "Summer";
                break;
            case 9,10,11:
                Season = "Autumn";
                break;

            default:
                Season = "You are wrong";
        }
        System.out.println(Season);
        return Season;
    }

    //2.
    public static void getMonth() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter your season: ");
        int month = enter.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.print("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.print("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.print("Summer");
        } else {
            System.out.print("Autumn");
        }
    }

    //3.
    public static void getNumber() {

            int number = 10;
            if (number % 2 == 0) {
                System.out.print("Четное число");
            } else {
                System.out.print("Нечетное число");
            }
        }

    //4.
    public static void getTemperature() {
        int temperature = -6;
        if (temperature > -5) {
            System.out.print("Тепло");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.print("Нормально");
        } else if (temperature <= -20) {
            System.out.print("Холодно");
        }
    }

    //5.
    public static void getColor() {
        Scanner enter = new Scanner(System.in);
        System.out.print("Please, enter your number: ");
        int num = enter.nextInt();

        if (num == 1) {
            System.out.print("Красный");
        } else if (num == 2) {
            System.out.print("Оранжевый");
        } else if (num == 3) {
            System.out.print("Желтый");
        } else if (num == 4) {
            System.out.print("Зеленый");
        } else if (num == 5) {
            System.out.print("Голубой");
        } else if (num == 6) {
            System.out.print("Синий");
        } else if (num == 7) {
            System.out.print("Фиолетовый");
        }
    }

    //Циклы
    //1.
    public static void whileLoop() {

        for (int i = 1;  i <= 99; i++) {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }

    //2.
    public static void forLoop() {
        int i = 5;
        while (i>0)

            {
                System.out.println(i);
                i--;
            }
    }

//3.
public static void forScan() {
    Scanner enter = new Scanner(System.in);
    System.out.print("Введите любое целое положительное число: ");
    int n = enter.nextInt();
    int sum = 0;
    for (int i = 1; i<=n; i++) {
        sum = sum+i;
        {
            System.out.println(sum);
        }
    }
}

//4.

    public static void plusSeven() {
        int i =7;
        while (i<=98)
         {
            System.out.println(i);
          i=i+7;
        }

    }

//5.
    public static void minusFive() {

        for (int i=0; i>-50; i= i-5)

        {
            System.out.println(i);


        }
    }
    //6.

    public static void getSquare() {

        for (int i=10; i<=20; i++)

        {
            System.out.println(i*i);

        }
    }

}





