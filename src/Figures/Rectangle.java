package Figures;


public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public double getAria() {
        double area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (width + height) * 2;
return perimeter;
        //return (width + height) * 2;
    }
}
