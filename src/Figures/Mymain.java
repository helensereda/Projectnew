package Figures;
import Figures.Figure;
import Figures.Triangle;
import Figures.Rectangle;
import Figures.Circle;

public class Mymain {
    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 5);
        figures[2] = new Circle(2);
        figures[3] = new Triangle(5, 12, 13);
        figures[4] = new Rectangle(6, 8);

        double perimeterSum = 0;

        for (Figure fig : figures) {
            perimeterSum += fig.getPerimeter();

            System.out.println("Сумма периметров всех фигур равна: " + perimeterSum);
        }
    }
}

