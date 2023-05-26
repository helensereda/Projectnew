package Figures;
// пл.треуг = шир*выс/2
 public class Triangle extends Figure {

    private String figureName;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle( String figureName, double sideA, double sideB, double sideC) {
        super(figureName);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double getAria() {
        double p = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}


