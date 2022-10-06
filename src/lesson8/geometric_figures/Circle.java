package lesson8.geometric_figures;

public class Circle extends Shape{

    private double radius;
    private final double PI = 3.1415926;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }
}
