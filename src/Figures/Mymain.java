package Figures;

public class Mymain {
    public static void main(String[] args) {



        Figure[] figures = {
                new Triangle ("Triangle", 5,6,8),
                new Rectangle ("Rectangle", 5,7),
                new Circle ( "Circle", 2),
                new Triangle("Triangle1", 5,8,10),
                new Circle( "Circle1", 6),
        };


        for (int i =0; i < figures.length; i++)
        {
            System.out.println("Aria" + ":" + figures[i].getFigureName() + "-" + figures[i].getAria());
        }
        System.out.println("");

        for (int i =0; i < figures.length; i++)
        {

            System.out.println("Perimeter" + ":" + figures[i].getFigureName() + "-" + figures[i].getPerimeter());
        }


        double perimeterSum = 0;
        for (int i =0; i < figures.length; i++)
            perimeterSum += figures[i].getPerimeter();

        {
            System.out.println();
            System.out.println("Sum of perimeterSum of all figures is : " + perimeterSum);
        }
    }
}

