package Figures;

public class Circle extends Figure {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }


@Override
   public double getAria() {
       double area = Math.PI * radius * radius;
      return area;
   }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
