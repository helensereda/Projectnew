package Figures;

public class Rectangle extends Figure {
    private String figureName;
    private double width;
    private double height;

    public Rectangle(String figureName, double width, double height) {
        super(figureName);
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
